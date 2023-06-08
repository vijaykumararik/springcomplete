package Firstproject.References;

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
           ApplicationContext Context = new ClassPathXmlApplicationContext("Firstproject/References/Config3.xml");
           B b =Context.getBean("refb", B.class);
           System.out.println(b);
           A a =Context.getBean("refa", A.class);
           System.out.println(a);
           
             
        System.out.println("project end");
    }

	
}
