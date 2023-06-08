package com.hello.Airtel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//dao class
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
//    	Student st=new Student();
//    	st.setUsn(13);
//    	st.setName("aiay");
//    	st.setSalary(1234.54);
//to add data
    	/*    	Emp e=new Emp();
    	e.setName("raja");
    	e.setSalary(1234.46);
    	e.setX(12);
       Configuration configuration = new Configuration();
       configuration.configure("hibernate.cfg.xml");
       SessionFactory buildSessionFactory = configuration.buildSessionFactory();
       Session Session = buildSessionFactory.openSession();
       Transaction tx= Session.beginTransaction();
       Session.save(e);
       tx.commit();
       Session.close();
       buildSessionFactory.close();
       */
    	//to featch data
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	 SessionFactory buildSessionFactory = configuration.buildSessionFactory();
    	 Session openSession = buildSessionFactory.openSession();
    	 Emp emp = openSession.get(Emp.class,1);
    	 System.out.println(emp);
    	 Emp load = openSession.load(Emp.class,2);
    	System.out.println(load);
    	openSession.close();
    }
}
