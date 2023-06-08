package Firstproject.Constobjectinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
           ApplicationContext Context = new ClassPathXmlApplicationContext("Firstproject/Constobjectinject/Config5.xml");
           Dept d=Context.getBean("refdept", Dept.class);
           System.out.println(d);
           Emp1 e=Context.getBean("refemp1", Emp1.class);
           System.out.println(e);
             
        System.out.println("project end");
    }

	
}
