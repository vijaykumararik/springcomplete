package com;

import java.util.List;

public class Branch {
private String location;
private List<ProvisionStrore> pdetails;
public Branch(String location, List<ProvisionStrore> pdetails) {
	super();
	this.location = location;
	this.pdetails = pdetails;
}
@Override
public String toString() {
	return "Branch [location=" + location + ", pdetails=" + pdetails + "]";
}


}
