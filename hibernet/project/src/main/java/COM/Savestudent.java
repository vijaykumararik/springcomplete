package COM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Savestudent {
 public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vijay");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Student student=new Student();
	student.setId(25);
	student.setGender("male");

	student.setMarks(85);
	student.setPhno(8524585858l);
	entityTransaction.begin();
	entityManager.persist(student);
	entityTransaction.commit();
}
}
