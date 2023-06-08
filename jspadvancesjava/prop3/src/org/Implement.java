package org;

import com.MobileFactory;
import com.pro.WatcFactory;

public class Implement {
public static void main(String[] args) {
	MobileFactory m=new MobileFactory();
	m.getMobiles("iPhone");
	WatcFactory w=new WatcFactory();
	w.getWatch("acropila");
}
}
