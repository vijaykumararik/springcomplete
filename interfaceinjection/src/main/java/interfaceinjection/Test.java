package interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext
			("interfaceinjection/config.xml");
	Customer cs=(Customer) c1.getBean("customer");
	System.out.println(cs);
	  Account a= cs.getAccount();
      a.withdraw();
      a.deposit();
	
	
	
	
}
}
