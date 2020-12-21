package com.erosion.core.protocol.models;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BetterProtocolContext extends BaseProtocolContext{
    private HandlerMethod handlerMethod;

    public BetterProtocolContext(HttpServletRequest request, HttpServletResponse response)
    {
        super(request,response);
    }

    public BetterProtocolContext(HttpServletRequest request, HttpServletResponse response,HandlerMethod handlerMethod)
    {
        this(request,response);
        this.handlerMethod = handlerMethod;
    }

    public HandlerMethod getHandlerMethod() {
        return handlerMethod;
    }

    public void setHandlerMethod(HandlerMethod handlerMethod) {
        this.handlerMethod = handlerMethod;
    }
}
