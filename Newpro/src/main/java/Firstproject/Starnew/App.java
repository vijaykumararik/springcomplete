package Firstproject.Starnew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
           ApplicationContext Context = new ClassPathXmlApplicationContext("Firstproject/Starnew/Config2.xml");
       Emp p=Context.getBean("emp1", Emp.class);
           System.out.println(p);
             
        System.out.println("project end");
    }

	
}
