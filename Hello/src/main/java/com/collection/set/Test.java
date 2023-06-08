package com.collection.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext
			("com/collection/set/config.xml");
	IPl l=(IPl) c1.getBean("abc");
	System.out.println(l);
	
}
}
