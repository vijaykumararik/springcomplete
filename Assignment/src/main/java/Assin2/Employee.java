package Assin2;

import java.util.List;

public class Employee {
private int empid;
private String empname;
private List<Project> projectdetails;

public Employee(int empid, String empname, List<Project> projectdetails) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.projectdetails = projectdetails;
	
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", projectdetails=" + projectdetails + 
			 "]";
}





}
