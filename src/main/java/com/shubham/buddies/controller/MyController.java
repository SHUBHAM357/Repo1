package com.shubham.buddies.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyController {
	
	@RequestMapping("/")
    public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index.html");
	    return modelAndView;
    }
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/getData")
	public String getData(@RequestBody String name) {
		return "Hello Mr. "+name;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getData1")
	public String getData1(HttpServletRequest request) {
		System.out.println(request.getRemoteHost());
		return "Hello Mr. ";
	}

}
