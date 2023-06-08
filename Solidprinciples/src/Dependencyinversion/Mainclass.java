package Dependencyinversion;

public class Mainclass {
public static void main(String[] args) {
	 Objectcreate o=new Objectcreate();
	Product p1=o.create();
	System.out.println("number of pages is "+p1.countProduct(100)/10);
	
}
}

