package com;

import java.util.List;

public class College {
private String collegename;
private String location;
private List<Branch> branchdetails;
public String getCollegename() {
	return collegename;
}
public void hi() {
	
}
public void bye() {
	System.out.println("destroied");
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<Branch> getBranchdetails() {
	return branchdetails;
}
public void setBranchdetails(List<Branch> branchdetails) {
	this.branchdetails = branchdetails;
}
@Override
public String toString() {
	return "College [collegename=" + collegename + ", location=" + location + ", branchdetails=" + branchdetails + "]";
}

}
