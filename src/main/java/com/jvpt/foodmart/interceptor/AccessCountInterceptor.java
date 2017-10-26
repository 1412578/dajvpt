package com.jvpt.foodmart.interceptor;

import com.jvpt.foodmart.service.AccessStatisticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AccessCountInterceptor extends HandlerInterceptorAdapter {
    private AccessStatisticalService accessStatisticalService;
    @Autowired
    public void setAccessStatisticalService(AccessStatisticalService accessStatisticalService){
        this.accessStatisticalService = accessStatisticalService;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws java.lang.Exception {
        if (modelAndView == null || !modelAndView.hasView())
            return;
        accessStatisticalService.upAccess();
        modelAndView.addObject("access_count", accessStatisticalService.getAccessCount());
    }
}
