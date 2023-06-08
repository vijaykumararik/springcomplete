package com.jspiders.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	
	@RequestMapping("welcome1")
	public ModelAndView helloworld1()
	{
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("msg", "so whaaat...???");
		return modelandview;
	}
	
	
	
}
