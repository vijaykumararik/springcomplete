package com.lifecycle;

public class Employee {
private int empid;
private String empname;
public void hi() {
	empid=getEmpid();
	empname=getEmpname();
	System.out.println("this is init method");
}
public void bye() {
	System.out.println("this is destroy method");
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + "]";
}

}
