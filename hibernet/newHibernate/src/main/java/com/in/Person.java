package com.in;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
	private int id;
 private String name;
 private int age;
 private long phno;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
 
 
}
