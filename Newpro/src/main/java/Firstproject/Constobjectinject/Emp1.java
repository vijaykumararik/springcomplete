package Firstproject.Constobjectinject;

public class Emp1 {
	private String ename;
	private int eid;
	private double esal;
	private Dept dept;
	public Emp1(String ename, int eid, double esal, Dept dept) {
		this.ename = ename;
		this.eid = eid;
		this.esal = esal;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp1 [ename=" + ename + ", eid=" + eid + ", esal=" + esal + ", dept=" + dept + "]";
	}
	
}
