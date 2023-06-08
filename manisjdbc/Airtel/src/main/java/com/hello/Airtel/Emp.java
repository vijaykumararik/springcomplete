package com.hello.Airtel;
import javax.persistence.Column;
//pojo class
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="euroemp")
public class Emp {
   @Id
   @GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
   @Column(name="$name",length=20)
private String name;

private double salary;
@Transient
private int x;
public Emp() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", x=" + x + "]";
}

}
