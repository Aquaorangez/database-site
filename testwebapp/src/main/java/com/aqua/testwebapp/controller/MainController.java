package com.aqua.testwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
	
	@RequestMapping("/objects") 
	public String listObjects(Model theModel) {
		
		return "object-list";
	}
	

}
