package com.work;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new 
			ClassPathXmlApplicationContext("com/work/config.xml");
	Vehicle v=(Vehicle) c1.getBean("vehicle");
	System.out.println(v);
}
}
