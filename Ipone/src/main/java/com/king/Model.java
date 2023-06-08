package com.king;


public class Model {
 private int Ram;
 private String model;
 private double price;
public int getRam() {
	return Ram;
}
public void setRam(int ram) {
	Ram = ram;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Model [Ram=" + Ram + ", model=" + model + ", price=" + price + "]";
}
 
}
