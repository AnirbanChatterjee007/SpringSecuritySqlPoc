package com.example.course.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {


	@RequestMapping("/")
	public String sayHi() {
		return "HI ANIRBAN";
	}
	
	@RequestMapping("/user")
	public String getUser() {
		return "I am USER";
	}
	
	@RequestMapping("/admin")
	public String getAdmin() {
		return "I am ADMIN";
	}
	
}
