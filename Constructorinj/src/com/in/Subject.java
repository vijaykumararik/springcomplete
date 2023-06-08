package com.in;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sub")
public class Subject {
    @Value("java")
	private String subname;

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	@Override
	public String toString() {
		return "Subject [subname=" + subname + "]";
	}

}
