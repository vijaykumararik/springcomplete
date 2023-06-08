package com.king;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainTest {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1 = 
	new ClassPathXmlApplicationContext("com/king/config.xml");
	Model s1=(Model) c1.getBean("xyz");
	System.out.println(s1);
}
}
