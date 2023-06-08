package com.usingsetter;

import java.util.List;

public class Branch {
private int bid;
private String bname;
private List<Student> students;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
@Override
public String toString() {
	return "Branch\n [bid=" + bid + ", bname=" + bname + "\n students=" + students + "]";
}


}
