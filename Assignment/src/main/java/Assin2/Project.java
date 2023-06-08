package Assin2;

public class Project {
   private int projectnum;
   private String projectname;
public Project(int projectnum, String projectname) {
	super();
	this.projectnum = projectnum;
	this.projectname = projectname;
}
@Override
public String toString() {
	return "Project [projectnum=" + projectnum + ", projectname=" + projectname + "]";
}
   
}
