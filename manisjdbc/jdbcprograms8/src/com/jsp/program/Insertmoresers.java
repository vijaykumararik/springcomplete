package com.jsp.program;
import java.sql.*;
import java.util.Scanner;
public class Insertmoresers {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement pstmt=null;
	String inquery="insert into jdbc23.student values(?,?,?)";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("class loaded and registerd");
		con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306?user=root&password=vijay7991@arik");
		System.out.println("connection established");
		pstmt=con.prepareStatement(inquery);
		System.out.println("platform created");
		System.out.println("Setiing values into place holder");
		Scanner sca=new Scanner(System.in);
		while(true) {
			System.out.println("enter name");			
			String a=sca.next();
			System.out.println("enetr usn");
			int b=sca.nextInt();
			System.out.println("enetr marks");
			Double c=sca.nextDouble();
			pstmt.setInt(2, b);
			pstmt.setString(1, a);
			pstmt.setDouble(3, c);
			int x=pstmt.executeUpdate();
			System.err.println("you want to enter new record yes/no");
			String choise=sca.next();
			if(choise.equals("no")) {
				System.out.println("thank you all records added suscessfully");
				break;
			}
		}
		
//		System.out.println("record added "+x);
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
