package com.example.springbootaop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @Author: 姚飞虎
 * @Date: 2022/4/11 3:45 PM
 * @Description:
 */
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

    @Resource
    private OverageInterceptor overageInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(overageInterceptor).addPathPatterns("/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
