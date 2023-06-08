package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/config.xml");
}
}
