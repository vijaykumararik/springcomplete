package lifecycle2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class King {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("lifecycle2/config.xml");
	Student s1=(Student) c1.getBean("abc");
	System.out.println(s1);
	Student s2=(Student) c1.getBean("abc1");
	System.out.println(s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
	
	
	
}
}
