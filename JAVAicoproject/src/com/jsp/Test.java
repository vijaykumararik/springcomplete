package com.jsp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/jsp/congig.xml");
	
	System.out.println(c1.getBean("company"));
	
	
	
}
}

