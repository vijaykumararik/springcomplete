package com.usingsetter;

import java.util.List;

public class College {
private int cid;
private String cname;
private List<Branch> branches;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public List<Branch> getBranches() {
	return branches;
}
public void setBranches(List<Branch> branches) {
	this.branches = branches;
}
@Override
public String toString() {
	return "College \n[cid=" + cid + ", cname=" + cname + "\n branches=" + branches + "]";
}

}
