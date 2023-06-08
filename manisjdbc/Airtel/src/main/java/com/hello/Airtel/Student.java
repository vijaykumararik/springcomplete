package com.hello.Airtel;

import javax.persistence.Entity;
import javax.persistence.Id;
//pojo class java bean class
@Entity   //maping is done student name table is created
public class Student {
@Id //to make it primarg key
private int usn;
private String name;
private double salary;
public int getUsn() {
	return usn;

}
public void setUsn(int usn) {
	this.usn = usn;
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
public Student() {
	
}
@Override
public String toString() {
	return "Student [usn=" + usn + ", name=" + name + ", salary=" + salary + "]";
}

}
