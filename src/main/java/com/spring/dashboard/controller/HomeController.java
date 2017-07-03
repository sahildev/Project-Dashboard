package com.spring.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home( Model modal){
		// enable logging
		/*log.debug("In home Controller");*/
		return "index";
	}
	
	@RequestMapping("/addProject")
	public String addProject( Model modal){
		return "AddProject";
	}
	
	@RequestMapping("/help")
	public String help( Model modal){
		return "Help";
	}
	
	@RequestMapping("/settings")
	public String settings( Model modal){
		return "Settings";
	}
}
