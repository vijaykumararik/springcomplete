package com.onetomany;

import java.util.List;

public class Vehicle {
 private List<Car> cdetails;
 private List<Bike> bdetails;
public Vehicle(List<Car> cdetails, List<Bike> bdetails) {
	super();
	this.cdetails = cdetails;
	this.bdetails = bdetails;
}
@Override
public String toString() {
	return "Vehicle [cdetails=" + cdetails + ", bdetails=" + bdetails + "]";
}
 
}
