package com.problem.one;

import java.util.List;

public class Account {
private long accountnum;
private String branch;
private List<Customer> customers;
public long getAccountnum() {
	return accountnum;
}
public void setAccountnum(long accountnum) {
	this.accountnum = accountnum;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public List<Customer> getCustomers() {
	return customers;
}
public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}
@Override
public String toString() {
	return "Account [accountnum=" + accountnum + ", branch=" + branch + ", customers=" + customers + "]";
}

}
