package Firstproject.Multipleconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
           ApplicationContext Context = new ClassPathXmlApplicationContext("Firstproject/Multipleconstructor/Config5.xml");
           Test t=Context.getBean("test1", Test.class);
           System.out.println(t);
          t.add();
             
        System.out.println("project end");
    }

	
}
