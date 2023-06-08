package com;

public class MobileFactory {

void getMobile(String mobile) {
System.out.println(" mobile is"+mobile);
}
public static void main(String[] args) {
	MobileFactory m =new MobileFactory();
	m.getMobile("miphone");
}
}
