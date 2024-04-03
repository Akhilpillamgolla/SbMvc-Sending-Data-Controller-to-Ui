package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductUsingModel {
	
	@GetMapping("/product")
	public String getProductData(Model model) {
		
		model.addAttribute("pid", "101");       //Entries with associated with keys
		model.addAttribute("pname", "Monitor");
		model.addAttribute("price", "₹5000");
		model.addAttribute("ptype", "LCD");
		
		
		
		
		return "product";      //product is logical view  
	}

}
