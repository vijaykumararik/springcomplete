package Firstproject.Newpro;

public class Student {
private int usn;
private String name;
private double marks;
public int getUsn() {
	return usn;
}
public void setUsn(int usn) {
	this.usn = usn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + "]";
}

}
