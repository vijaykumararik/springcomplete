package org.jsp.jdbcbasics;
//object creation class(helper class)-contains helper methods to create objects
public class Lightfactory {
    //factory helper method --ISWITCH acts as implementation object
	public static ISWITCH getLight(String type)
	{
		if(type.equalsIgnoreCase("Tubelight")) {
			System.out.println("Tube light object iscreated");
			return new Tubelight();
			
		}else if(type.equalsIgnoreCase("Ledbulp")) {
			System.out.println("ledligth object created");
			return new Ledbulp();
		}else {
			//to get red color making err
			System.err.println("invalid no object is created");
			return null;
		}
		
		
	}
}
