package com.usingsetter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/usingsetter/config.xml");
	System.out.println(c1.getBean("college"));
	
	
	
	
}
}
