package com.question5.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.question5.helloworld.dto.HelloWorldDTO;
import com.question5.helloworld.service.HelloWorldService;

@Controller
public class HelloWorldController {

	private final HelloWorldService service;
	
	public HelloWorldController(HelloWorldService service) {
		this.service = service;
	}
	
	@GetMapping("/hello")
	public String get(Model model) {
		HelloWorldDTO dto = service.getMessage();
		
		model.addAttribute("message", dto.getMessage());
		return "hello";
	}
	
}
