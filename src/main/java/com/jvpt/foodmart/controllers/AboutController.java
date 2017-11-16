package com.jvpt.foodmart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutController {
    @RequestMapping({"", "/", "index"})
    public String index(){
        return "about/index";
    }

}
