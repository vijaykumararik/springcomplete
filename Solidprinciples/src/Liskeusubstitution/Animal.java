package Liskeusubstitution;

public interface Animal {
	static void  runraja() {
	  System.out.println("not able to fly");
  }
}
 abstract class Bird implements Animal{
	 abstract void fly();
 }
 class Parrot extends Bird{
	@Override
	void fly() {
        System.out.println("parrot flying");		
	}
	 
 }
 class Sparrow extends Bird{

	@Override
	void fly() {
       System.out.println("sparrow flying");		
	}
	 
 }
 class Ostrich implements Animal{

	public void runraja() {
          System.out.println("not able to fly");		
	}
	 
 }
 
