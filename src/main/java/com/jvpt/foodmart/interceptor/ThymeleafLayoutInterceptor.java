package com.jvpt.foodmart.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ThymeleafLayoutInterceptor extends HandlerInterceptorAdapter {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws java.lang.Exception {
        if (modelAndView == null || !modelAndView.hasView())
            return;
        String viewName = modelAndView.getViewName();
        if (viewName.startsWith("redirect:") || viewName.startsWith("forward"))
            return;
        if (modelAndView.getModel().get("layout")!= null)
            modelAndView.setViewName("layouts/".concat(modelAndView.getModel().get("layout").toString()));
        else
            modelAndView.setViewName("layouts/default");
        modelAndView.addObject("view", viewName);
    }
}
