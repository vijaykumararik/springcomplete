package org.jsp.jdbcbasics;

public class Tubelight implements ISWITCH{
	@Override
	public void on() {
		System.out.println("tubelight is on study");	
	}

	@Override
	public void off() {
		System.out.println("light is off you are saving money");
	}
}
