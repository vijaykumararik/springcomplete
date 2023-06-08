package com;

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
           ApplicationContext Context = new ClassPathXmlApplicationContext("Firstproject/Newpro/Config1.xml");
        //upcasting
           Student a=(Student) Context.getBean("student1");
           System.out.println(a);
           
             
        System.out.println("project end");
    }

	
}
