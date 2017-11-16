package com.jvpt.foodmart.controllers;

import java.util.ArrayList;
import java.util.List;

import com.jvpt.foodmart.entity.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gallery")
public class GalleryController {
	@RequestMapping({"", "/", "index"})
	    public String gallery(Model model) {
		 	List<Food> listFood = new ArrayList<>();
		 	Food food1 = new Food(1, "BUTTER PIZZA", 23, 20, "p1.jpg", "butter pizza");
		 	Food food2 = new Food(2, "PASTA", 21, 17, "p2.jpg", "pasta");
		 	Food food3 = new Food(3, "LEMON CHEESE", 65, 55, "p3.jpg", "lemon cheese");
		 	Food food4 = new Food(4, "TOASTED PUFF", 25, 21, "p4.jpg", "toasted puff");
		 	Food food5 = new Food(5, "BURGER CHEESE", 36, 30, "p5.jpg", "burger cheese");
		 	
		 	listFood.add(food1);
		 	listFood.add(food2);
		 	listFood.add(food3);
		 	listFood.add(food4);
		 	listFood.add(food5);
		 	
		 	model.addAttribute("gallery", listFood);
	        return "gallery/index";
	    }
}
