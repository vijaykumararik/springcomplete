package Firstproject.Constructorinjection;

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
           ApplicationContext Context = new ClassPathXmlApplicationContext("Firstproject/Constructorinjection/Config4.xml");
           Emp e=Context.getBean("emp1", Emp.class);
           System.out.println(e);
             
        System.out.println("project end");
    }

	
}
