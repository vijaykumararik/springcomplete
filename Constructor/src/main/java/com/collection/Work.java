package com.collection;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Work {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/collection/congig.xml");
	Beanclass b=(Beanclass) c1.getBean("beanclass");
	List<String> l1= b.getProjects();
	System.out.println(c1.getBean("beanclass"));
	System.out.println(l1.getClass());
}
}
