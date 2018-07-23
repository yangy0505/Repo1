package com.yangying.por.config;

import com.yangying.por.interceptor.CheckUserIsLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CheckUserIsLoginInterceptor())
                .addPathPatterns("/admin/**").excludePathPatterns("/admin/login", "/admin/404");
    }

}
