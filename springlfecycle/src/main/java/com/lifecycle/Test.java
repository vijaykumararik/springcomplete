package com.lifecycle;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/lifecycle/config.xml");
	Employee e=(Employee) c1.getBean("abc");
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter empno here");
	int d=s.nextInt();
	e.setEmpid(d);
//	s.nextLine();
	System.out.println("enter emp name here");
	String nae=s.next();
	e.setEmpname(nae);
	System.out.println(e);
	e.bye();
	if(c1!=null) {
		c1.close();
	}
	
	
	
	
}
}
