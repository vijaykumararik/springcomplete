

package com.jsp.mavenproject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext(
				"com/jsp/mavenproject1/configation.xml");
		Student s1=(Student) c1.getBean("abc");
		System.out.println(s1);
	}
}
   