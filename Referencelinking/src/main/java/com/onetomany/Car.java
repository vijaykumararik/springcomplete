package com.onetomany;

public class Car {
private int cnum;
private String cname;
public Car(int cnum, String cname) {
	super();
	this.cnum = cnum;
	this.cname = cname;
}
@Override
public String toString() {
	return "Car [cnum=" + cnum + ", cname=" + cname + "]";
}

}
