package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.LoginForm;

@Controller
public class LoginController {
	
	private static final String EMAIL = "morimoto_haruki@example.com";
	
	private static final String PASSWORD = "asdf";

	@GetMapping("/login")
	public String loginView(Model model, LoginForm form) {
		
		return "login";
	}
	
	@PostMapping("/login")
	public String login(Model model, LoginForm form) {
		var isCorrectUserAuth = form.getEmail().equals(EMAIL)
				&& form.getPassword().equals(PASSWORD);
		
		if(isCorrectUserAuth) {
			return "redirect:/index";
		}else {
			model.addAttribute("errorMsg", "ログインに失敗しました");
			return "login";
		}
	}
}
