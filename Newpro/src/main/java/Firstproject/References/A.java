package Firstproject.References;

public class A {
private int x;
private B b;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public B getB() {
	return b;
}
public void setB(B b) {
	this.b = b;
}
@Override
public String toString() {
	return "A [x=" + x + ", b=" + b + "]";
}

}
