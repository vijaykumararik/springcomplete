package COM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Getdata {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vijay");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Student student=entityManager.find(Student.class, 3);
	System.out.println("student id "+student.getId());
	System.out.println("student name "+student.getName());
	System.out.println("student gender "+student.getGender());
	System.out.println("student marks "+student.getMarks());
	System.out.println("student phno "+student.getPhno());
	
	
	
}
}
