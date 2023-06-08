package com;

public class MobileFactory {
  public void getMobiles(String mobile) {
	 System.out.println("mobile is "+mobile);
 }
 public static void main(String[] args) {
	MobileFactory m=new MobileFactory();
	m.getMobiles("Miphone");
}
}
