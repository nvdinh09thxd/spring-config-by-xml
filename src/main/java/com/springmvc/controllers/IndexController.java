package com.springmvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class IndexController {

	@GetMapping("hello")
	public String sayHello() {
		return "<p style='color: blue'>Hello World!</p>";
	}
	
	@GetMapping("bye")
	public String sayGoodbye() {
		return "<p style='color: violet'>Goodbye!</p>";
	}
}
