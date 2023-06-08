package com.work;

public class Bike {
private int bikeid;
private String bikename;
public int getBikeid() {
	return bikeid;
}
public void setBikeid(int bikeid) {
	this.bikeid = bikeid;
}
public String getBikename() {
	return bikename;
}
public void setBikename(String bikename) {
	this.bikename = bikename;
}
@Override
public String toString() {
	return "Bike [bikeid=" + bikeid + ", bikename=" + bikename + "]";
}

}
