package com.naver.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/sample1") // http://localhost:9000/sample1
	public String sample1(Model model) {
		model.addAttribute("data", "hello!!");
		return "test1/sample1";
	}
	
	
}
