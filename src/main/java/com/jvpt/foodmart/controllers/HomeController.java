package com.jvpt.foodmart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping({"", "/", "index"})
    public String index(Model model){
        model.addAttribute("view_layout", "home");
        return "home/index";
    }
}
