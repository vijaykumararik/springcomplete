package com.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hellovijay {
 
	@RequestMapping("hello")
	public String hello() {
		 return "hellopage";
}
}
