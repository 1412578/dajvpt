package com.jvpt.foodmart.controllers;

import java.util.ArrayList;
import java.util.List;

import com.jvpt.foodmart.entity.Branch;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/branches")
public class BranchesController {
	@RequestMapping({"", "/", "index"})
    public String listBranch(Model model) {
    	List<Branch> listBranch = new ArrayList<>();
	 	Branch branch1 = new Branch(1, "Food House 1", "159 Hung Phu", "TP HCM", "0989112153", 15, "");
	 	Branch branch2 = new Branch(2, "Food House 2", "195 Quang Trung", "Kien Giang", "098828464", 15, "");
	 	Branch branch3 = new Branch(3, "Food House 3", " 21 Nguyen Van Cu", "TP HCM", "0989112153", 15, "");
	 	Branch branch4 = new Branch(4, "Food House 4", "59 Nguyen Trai", "TP HCM", "0988391293", 15, "");
	 	Branch branch5 = new Branch(5, "Food House 5", "9 Su Van Hanh", "TP HCM", "01639103218", 15, "");
	 	listBranch.add(branch1);
	 	listBranch.add(branch2);
	 	listBranch.add(branch3);
	 	listBranch.add(branch4);
	 	listBranch.add(branch5);
	 	
	 	model.addAttribute("branches", listBranch);
        return "branches/index";
        
    }
}
