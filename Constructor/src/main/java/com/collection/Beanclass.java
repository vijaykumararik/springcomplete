package com.collection;

import java.util.List;

public class Beanclass {
private int  empid;
private String empname;
private List<String> projects;
public Beanclass(int empid, String empname, List<String> projects) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.projects = projects;
}
@Override
public String toString() {
	return "Beanclass [empid=" + empid + ", empname=" + empname + ", projects=" + projects + "]";
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
public List<String> getProjects() {
	return projects;
}
public void setProjects(List<String> projects) {
	this.projects = projects;
}



}
