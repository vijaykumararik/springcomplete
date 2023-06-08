package com.primitive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext
			("com/primitive/congig.xml");
	Subject s1=(Subject) c1.getBean("subject");
	System.out.println(s1);
	System.out.println(c1.getBean("subject1"));
	System.out.println(c1.getBean("subject2"));
}
}
