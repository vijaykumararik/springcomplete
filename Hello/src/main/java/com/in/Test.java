
package com.in;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1 =new ClassPathXmlApplicationContext
			("com/in/congig.xml");
	Company com=(Company) c1.getBean("abc");
	System.out.println(com);
}
}
