package com.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testwork {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new 
			ClassPathXmlApplicationContext("com/ref/congig.xml");
	Company cp= (Company) c1.getBean("company");
	System.out.println(cp);
}
}
