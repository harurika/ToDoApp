package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToDoController {

	@GetMapping("/index")
	public String toDoView() {
		
		return "index";
	}
}
