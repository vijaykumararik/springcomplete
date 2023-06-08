package Firstproject.Multipleconstructor;

public class Test {
private int x;
private int y;
public Test(int x, int y) {
	this.x = x;
	this.y = y;
	System.out.println("constructor---int int");
}
public Test(double x, double y) {
	this.x = (int) x;
	this.y = (int) y;
	System.out.println("constructor---double double");
}
public Test(String x, String y) {
	this.x = Integer.parseInt(x);
	this.y = Integer.parseInt(y);
	System.out.println("constructor---String String");
}
public void add() {
	System.out.println("addition of x and y is :"+(x+y));
}
@Override
public String toString() {
	return "Test [x=" + x + ", y=" + y + "]";
}

}
