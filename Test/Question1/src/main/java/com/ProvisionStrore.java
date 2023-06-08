package com;

import java.util.List;

public class ProvisionStrore {
private String storename;
private String location;
private List<Customer> customerdetails;
public ProvisionStrore(String storename, String location, List<Customer> customerdetails) {
	super();
	this.storename = storename;
	this.location = location;
	this.customerdetails = customerdetails;
}
@Override
public String toString() {
	return "ProvisionStrore [storename=" + storename + ", location=" + location + ", customerdetails=" + customerdetails
			+ "]";
}




}
