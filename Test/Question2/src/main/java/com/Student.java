package com;

public class Student {
 private int studentid;
 private String studentname ;
 private double marks;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", marks=" + marks + "]";
}
 
}
