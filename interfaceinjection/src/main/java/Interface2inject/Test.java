package Interface2inject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("Interface2inject/config.xml");
	Manager m=(Manager) c1.getBean("manager");
	System.out.println(m);
	Company c=m.getCompany();
	c.project();
	m.getCompany1().project();
	
	
	
	
	
	
	
	
}
}
