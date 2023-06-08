package com.problem.one;

public class Customer {
	private String customername;
	private int phnum;
	private String emailid;
@Override
	public String toString() {
		return "Customer [customername=" + customername + ", phnum=" + phnum + ", emailid=" + emailid + "]";
	}
public void hi() {
	customername="vjay";
	phnum=8524541;
	emailid="viji@gamil";
}
public void bye() {
	System.out.println("this is destroy method");
}
public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getPhnum() {
		return phnum;
	}
	public void setPhnum(int phnum) {
		this.phnum = phnum;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}



}
