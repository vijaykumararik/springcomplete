package com.primitive;

public class Subject {

private int subcode;
private String subname;
public Subject(int subcode, String subname) {
	super();
	this.subcode = subcode;
	this.subname = subname;
}
@Override
public String toString() {
	return "Subject [subcode=" + subcode + ", subname=" + subname + "]";
}




}
