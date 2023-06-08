package org.jsp.jdbcbasics;

import java.util.Scanner;
//utilisation class 
public class Mainclass {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter which light u want to on");
	String choise=s.next();
	ISWITCH light = Lightfactory.getLight(choise);
	//to avoid null pointer exception we using if condtion 
	//null pointer exception is pointing to an object which is not present compplier
	//will throws null pointer exception
	if(light!=null) {
	light.on();
	light.off();}
	s.close();
}
}
