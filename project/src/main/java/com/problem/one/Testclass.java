package com.problem.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext
			("com/problem/one/congig.xml");
	Account n=(Account) c1.getBean("abc");
	Customer c=new Customer();
	c.bye();
	c1.close();
	System.out.println(n);
	
	
}
}
