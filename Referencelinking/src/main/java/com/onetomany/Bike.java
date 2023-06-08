package com.onetomany;

public class Bike {
private int bnum;
private String bname;
public Bike(int bnum, String bname) {
	super();
	this.bnum = bnum;
	this.bname = bname;
}
@Override
public String toString() {
	return "Bike [bnum=" + bnum + ", bname=" + bname + "]";
}

}
