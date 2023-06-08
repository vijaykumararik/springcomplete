package com.pro;

public class WatcFactory {
  public void getWatch(String watch) {
	 System.out.println("Watc is "+watch );
 }
 public static void main(String[] args) {
	WatcFactory w=new WatcFactory();
	w.getWatch("titan");
}
}
