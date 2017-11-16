package com.jvpt.foodmart.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 *
 */
@Component
public class ThymeleafLayoutInterceptor extends HandlerInterceptorAdapter {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws java.lang.Exception {
        if (modelAndView == null || !modelAndView.hasView())
            return;
        String viewName = modelAndView.getViewName();
        if (viewName.startsWith("redirect:") || viewName.startsWith("forward:"))
            return;

        Map<String, Object> model = modelAndView.getModel();
        modelAndView.setViewName(model.get("view_layout")!=null
                ? "layouts/".concat(model.get("view_layout").toString())
                : "layouts/default");
        modelAndView.addObject("view_template", viewName);

        if (model.get("view_style")==null)
            modelAndView.addObject( "view_style", viewName);
    }
}
