package com.jvpt.foodmart.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.function.Predicate;

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
        if (viewName.startsWith("redirect:") || viewName.startsWith("forward"))
            return;

        Map<String, Object> model = modelAndView.getModel();
        modelAndView.setViewName(model.get("layout")!=null
                ? "layouts/".concat(model.get("layout").toString())
                : "layouts/default");
        modelAndView.addObject("view_template", viewName);

        if (model.get("view_style")==null)
            modelAndView.addObject( "view_style", viewName);
    }
}
