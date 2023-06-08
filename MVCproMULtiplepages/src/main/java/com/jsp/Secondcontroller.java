package com.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Secondcontroller {
     @RequestMapping("/rajapage")
	public String rani()
{
	return "ranipage"; 
}     @RequestMapping("/process")
     public String mantri() {
    	 return "mantripage";
     }
}
