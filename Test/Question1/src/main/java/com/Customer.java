package com;

public class Customer {
private int customerid;
private String customername;
private long phnum;
public Customer(int customerid, String customername, long phnum) {
	super();
	this.customerid = customerid;
	this.customername = customername;
	this.phnum = phnum;
}
@Override
public String toString() {
	return "Customer [customerid=" + customerid + ", customername=" + customername + ", phnum=" + phnum + "]";
}


}
