package org.jsp.jdbcbasics;

public class Ledbulp implements ISWITCH{

	@Override
	public void on() {
		System.out.println("study in led bulp");	
	}

	@Override
	public void off() {
		System.out.println("led light is off wow");
	}

}
