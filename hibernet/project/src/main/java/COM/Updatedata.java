package COM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updatedata {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vijay");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Student student=entityManager.find(Student.class, 1);
	entityTransaction.begin();
	student.setMarks(88);
	entityManager.merge(student);
	entityTransaction.commit();
}
}
