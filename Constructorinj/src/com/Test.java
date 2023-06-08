package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

;

public class Test {
public static void main(String[] args) {
	AnnotationConfigApplicationContext a1=new 
			AnnotationConfigApplicationContext(Configration.class);
	Student e1=(Student) a1.getBean("hello",Student.class);
	System.out.println(e1);
}
}
