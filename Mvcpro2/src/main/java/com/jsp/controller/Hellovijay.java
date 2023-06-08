package com.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hellovijay {
 
	@RequestMapping("hello")
	public ModelAndView hello() {
		ModelAndView view =new ModelAndView("hellopage");
		view.addObject("hi" ,"firest my application");
		return view;
	}
	@RequestMapping("hello1")
	public ModelAndView hello1() {
		ModelAndView view =new ModelAndView("secondpage");
		view.addObject("hello" ,"second  my application");
		return view;
	}
}
