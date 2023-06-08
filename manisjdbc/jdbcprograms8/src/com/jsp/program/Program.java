package com.jsp.program;
import java.sql.*;

//1st step import sql class
public class Program {
public static void main(String[] args) {
	//(connection interface iam declaring here with some reference variable)
	Connection con=null;
	Statement stmt=null;
	String queary="insert into jdbc23.student values('mr mjay',128,4055.45)";
	
	//2nd step
		try {
		    	Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver class loaded and registerd");
			//3rd step of jdbc
			con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306?user=root&password=vijay7991@arik");
			System.out.println("connection established between java app and database");
			//4th step of jdbc
			stmt=con.createStatement();
			System.out.println("statement or platform created");
//			boolean b=stmt.execute(queary);
			int b =stmt.executeUpdate(queary);
			System.out.println("queary inserted "+b);
			System.out.println("queary executed");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
}
	
}
