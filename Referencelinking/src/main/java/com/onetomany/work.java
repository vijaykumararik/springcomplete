package com.onetomany;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class work {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/onetomany/congig.xml");
	System.out.println(c1.getBean("vechile"));
	
	
	
	
}
}
