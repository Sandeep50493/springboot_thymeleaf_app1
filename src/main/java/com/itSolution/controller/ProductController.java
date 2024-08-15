package com.itSolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.itSolution.bindings.Product;

@Controller
public class ProductController {
	
	//method to display form
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("product",new Product());
		
		return "index";
	}
	

	@PostMapping("/product")
	public String handleSubmitBtn(Product p,Model model) {
		
		System.out.println(p);
		
		model.addAttribute("msg","Product Saved");
		return "index";
	}
	
	

}
