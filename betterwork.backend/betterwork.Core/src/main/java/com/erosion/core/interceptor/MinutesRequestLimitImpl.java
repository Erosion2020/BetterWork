package com.erosion.core.interceptor;

import com.erosion.core.annotation.Interface.ActionFilterAnnotation;
import com.erosion.core.annotation.MinutesRequestLimit;
import com.erosion.core.protocol.models.BetterProtocolContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MinutesRequestLimitImpl extends ActionFilterAnnotation {
    public static Map<String, Integer> MemoryMap = new HashMap<String, Integer>();
    public static long LastClearTime = new Date().getTime();

    private int limit = 0;

    public static void WriteMemory(String key, Integer value)
    {
        synchronized (MemoryMap)
        {
            MemoryMap.put(key, value);
        }
    }
    public static void ClearMemory()
    {
        synchronized (MemoryMap)
        {
            MemoryMap.clear();
        }
    }
    public static HashMap<String,Integer> Copy()
    {
        synchronized (MemoryMap)
        {
            return new HashMap<String, Integer>(MemoryMap);
        }
    }

    @Override
    protected void InitParameter(BetterProtocolContext context) {
        limit = context.getHandlerMethod().getMethod().getAnnotation(MinutesRequestLimit.class).limit();
    }

    @Override
    public boolean OnActionExecuting(BetterProtocolContext context) {
        System.out.println("方法执行时...");
        if((new Date().getTime() - LastClearTime) / 1000 > 60)
        {
            ClearMemory();
            LastClearTime = new Date().getTime();
        }
        HashMap<String,Integer> temp = Copy();

        String path = context.getRequest().getRequestURI();
        String ip = context.getRequest().getRemoteAddr();

        if(temp.containsKey(ip + path))
        {
            WriteMemory(ip + path,temp.get(ip + path) + 1);
            temp = Copy();
            if(temp.get(ip + path) > limit)
            {
                context.getResponse().setHeader("second-retry-after",String.valueOf(60 - (new Date().getTime() - LastClearTime) / 1000));
                context.getResponse().setStatus(HttpStatus.TOO_MANY_REQUESTS.value());

                return false;
            }
        }else
        {
            temp.put(ip + path, 1);
            WriteMemory(ip + path, 1);
        }
        return true;
    }

}
