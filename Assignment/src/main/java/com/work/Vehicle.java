package com.work;

import java.util.List;

public class Vehicle {
 private List<Car> cardetails;
private List<Bike> bikedetals;
public List<Car> getCardetails() {
	return cardetails;
}
public void setCardetails(List<Car> cardetails) {
	this.cardetails = cardetails;
}
public List<Bike> getBikedetals() {
	return bikedetals;
}
public void setBikedetals(List<Bike> bikedetals) {
	this.bikedetals = bikedetals;
}
@Override
public String toString() {
	return "Vehicle\n [cardetails=" + cardetails + "\n bikedetals=" + bikedetals;
}

 
}
