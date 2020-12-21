package com.erosion.core.configuration;

import com.erosion.core.interceptor.MinutesRequestLimitImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfigure implements WebMvcConfigurer {

    public MinutesRequestLimitImpl limit()
    {
        return new MinutesRequestLimitImpl();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(limit()).addPathPatterns("/*");
    }
}
