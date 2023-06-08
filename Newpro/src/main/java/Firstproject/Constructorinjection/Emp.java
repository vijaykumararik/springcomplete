package Firstproject.Constructorinjection;

public class Emp {
private String ename;
private int eid;
private double salary;
public Emp(String ename, int eid, double salary) {
	
	this.ename = ename;
	this.eid = eid;
	this.salary = salary;
}
@Override
public String toString() {
	return "Emp [ename=" + ename + ", eid=" + eid + ", salary=" + salary + "]";
}

}
