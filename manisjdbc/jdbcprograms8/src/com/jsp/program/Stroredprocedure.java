package com.jsp.program;
import java.sql.*;
import java.util.Scanner;


public class Stroredprocedure {
public static void main(String[] args) {
 Connection con=null;
 CallableStatement cstmt=null;
 ResultSet rs=null;
 String query="{call jdbc23.newdetalils(?)}";
 try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=vijay7991@arik");
	cstmt=con.prepareCall(query);
	Scanner s=new Scanner(System.in);
	System.out.println("enetr employee id to featch");
	int eids=s.nextInt();
	cstmt.setInt(1, eids);
	rs=cstmt.executeQuery();
	if(rs.next()) {
		int eid=rs.getInt(2);
		String name=rs.getString(1);
		double marks=rs.getDouble(3);
		System.out.println("id: "+eid+" name: "+name+" marks: "+marks);
	}else {
		System.out.println("invalid");
	}
	s.close();
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 finally {
	 if(con!=null&&cstmt!=null&&rs!=null) {
	try {
		con.close();
		cstmt.close();
		rs.close();
		System.out.println("all costly resources are closed");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 }
}
 
}
}
