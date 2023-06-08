package com.map.collection;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext
			("com/map/collection/congig.xml");
	Bean n=(Bean) c1.getBean("abc");
	System.out.println(n);
	Map<String, String> l1 =n.getStateLanguage();
	System.out.println(l1.getClass());
}
}
