package com.in;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	AnnotationConfigApplicationContext a1=new AnnotationConfigApplicationContext(Subject.class);
	Subject s1=(Subject) a1.getBean("sub",Subject.class);
	System.out.println(s1);
}
}        


