package com;

import java.util.List;

public class Branch {
private int branchid;
private String branchname;
private List<Student> studentdetails;
public int getBranchid() {
	return branchid;
}
public void setBranchid(int branchid) {
	this.branchid = branchid;
}
public String getBranchname() {
	return branchname;
}
public void setBranchname(String branchname) {
	this.branchname = branchname;
}
public List<Student> getStudentdetails() {
	return studentdetails;
}
public void setStudentdetails(List<Student> studentdetails) {
	this.studentdetails = studentdetails;
}
@Override
public String toString() {
	return "Branch [branchid=" + branchid + ", branchname=" + branchname + ", studentdetails=" + studentdetails + "]";
}

}
