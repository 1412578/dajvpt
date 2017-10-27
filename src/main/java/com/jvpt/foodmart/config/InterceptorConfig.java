package com.jvpt.foodmart.config;

import com.jvpt.foodmart.interceptor.AccessCountInterceptor;
import com.jvpt.foodmart.interceptor.ThymeleafLayoutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    private AccessCountInterceptor accessCountInterceptor;
    private ThymeleafLayoutInterceptor thymeleafLayoutInterceptor;
    @Autowired
    public void setAccessCountInterceptor(AccessCountInterceptor accessCountInterceptor){
        this.accessCountInterceptor = accessCountInterceptor;
    }
    @Autowired
    public void setThymeleafLayoutInterceptor(ThymeleafLayoutInterceptor thymeleafLayoutInterceptor){
        this.thymeleafLayoutInterceptor = thymeleafLayoutInterceptor;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(thymeleafLayoutInterceptor);
        registry.addInterceptor(accessCountInterceptor);
    }
}
