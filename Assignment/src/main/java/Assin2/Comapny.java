package Assin2;

import java.util.List;

public class Comapny {
private String companyname;
private String location;
private List<Employee> empdetails;
public Comapny(String companyname, String location,  List<Employee> empdetails) {
	super();
	this.companyname = companyname;
	this.location = location;
	
	this.empdetails = empdetails;
}
@Override
public String toString() {
	return "Comapny [companyname=" + companyname + ", location=" + location + ", empdetails="
			+ empdetails + "]";
}

}
