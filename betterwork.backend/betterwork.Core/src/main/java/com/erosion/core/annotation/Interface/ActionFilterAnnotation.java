package com.erosion.core.annotation.Interface;

import com.erosion.core.exception.ActionObjectException;
import com.erosion.core.protocol.models.BetterProtocolContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

/**
 * Make it easier to create filters
 *
 * @author Erosion
 * @since 15.0.1
 */
public abstract class ActionFilterAnnotation implements HandlerInterceptor {

    private BetterProtocolContext context = null;

    protected abstract void InitParameter(BetterProtocolContext context);

    /**
     * Before target method execution
     * We recommend that you call InitAnnotation method before
     * for example: super.InitAnnotation( param: your Annotation Class object)
     *
     * @param context The context contains {@code HttpServletRequest} Object and
     *                {@code HttpServletResponse} Object and {@code HandlerMethod} Object
     * @return (true) The request will continue or (false) Request interrupted
     */
    public boolean OnActionExecuting(BetterProtocolContext context)
    {
        return false;
    }

    /**
     * After the target method is executed
     * @param context The context contains {@code HttpServletRequest} Object and
     *                {@code HttpServletResponse} Object and {@code HandlerMethod} Object
     * @param modelAndView
     */
    public void OnActionExecuted(BetterProtocolContext context, ModelAndView modelAndView)
    {

    }
    /**
     * After all actions have been executed
     * @param context The context contains {@code HttpServletRequest} Object and
     *                {@code HttpServletResponse} Object and {@code HandlerMethod} Object
     * @param exception
     */
    public void AllOperationDone(BetterProtocolContext context, Exception exception)
    {

    }
    private HandlerMethod resolver(Object handler)
    {
        HandlerMethod handlerMethod = null;
        if(handler instanceof HandlerMethod)
        {
            handlerMethod = (HandlerMethod) handler;
        }else
            throw new ActionObjectException();
        return handlerMethod;
    }

    @Override
    public final boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HandlerMethod handlerMethod = resolver(handler);
        context = new BetterProtocolContext(request,response,handlerMethod);
        InitParameter(context);
        return this.OnActionExecuting(context);
    }
    @Override
    public final void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        HandlerMethod handlerMethod = resolver(handler);
        context = new BetterProtocolContext(request,response,handlerMethod);
        InitParameter(context);
        this.OnActionExecuted(context,modelAndView);
    }

    @Override
    public final void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerMethod handlerMethod = resolver(handler);
        context = new BetterProtocolContext(request,response,handlerMethod);
        InitParameter(context);
        this.AllOperationDone(context,ex);
    }
}
