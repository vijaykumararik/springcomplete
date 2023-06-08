package com.ref;

public class Company {
private int companyid;
private String companyname;
private Emp e;
public int getCompanyid() {
	return companyid;
}
public void setCompanyid(int companyid) {
	this.companyid = companyid;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public Emp getE() {
	return e;
}
public void setE(Emp e) {
	this.e = e;
}
@Override
public String toString() {
	return "Company [companyid=" + companyid + ", companyname=" + companyname + ", e=" + e + "]";
}

}
