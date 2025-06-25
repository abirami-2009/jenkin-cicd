package com.wipro.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/vi/aws")
@RestController
public class WelcomeJenkinController {

	@GetMapping 
	public String welcome() {
		return "welcome jenkin";
		
	}
}
