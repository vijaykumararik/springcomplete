package com.jsp.program;
import java.sql.*;
public class Batcupdate {
public static void main(String[] args) {
	Connection con=null;
	Statement stmt=null;
	String inquery="insert into jdbc23.student values('pinga',183,234.45)";
	String inquery2="insert into jdbc23.student values('linga',456,834.45)";
	String delquery="delete from jdbc23.student where usn=156";
	String upquery="update jdbc23.student set name='ooitosh',marks=98 where usn=135 ";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306?user=root&password=vijay7991@arik");
		stmt=con.createStatement();
		System.out.println("statement created");
		stmt.addBatch(inquery);
		stmt.addBatch(inquery2);
		stmt.addBatch(delquery);
		stmt.addBatch(upquery);
		System.out.println("execution started");
		int[] e = stmt.executeBatch();
		for (int i : e) {
			System.out.println("record executed "+i);
		}
		System.out.println("done work");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
