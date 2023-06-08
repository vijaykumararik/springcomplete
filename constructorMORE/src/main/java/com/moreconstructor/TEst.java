package com.moreconstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TEst {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/moreconstructor/config.xml");
	System.out.println(c1.getBean("sample"));
	
	
	
}
}
