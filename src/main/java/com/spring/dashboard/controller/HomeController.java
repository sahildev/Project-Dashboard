package com.spring.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home( Model modal){
		return "index";
	}
	
	@RequestMapping("/addProject")
	public String addProject( Model modal){
		return "AddProject";
	}
}
