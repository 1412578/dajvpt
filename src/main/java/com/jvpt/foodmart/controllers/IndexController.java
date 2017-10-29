package com.jvpt.foodmart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping({"", "/", "index"})
    public String index(ModelAndView modelAndView){
        modelAndView.getModel().clear();
        return "redirect:/home";
    }
}
