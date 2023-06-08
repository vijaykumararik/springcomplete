package com.jsp.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Scanner;

public class Transactionmanage {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement pstmt1=null;
	PreparedStatement pstmt2=null;
	Savepoint sp=null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=vijay7991@arik");
		con.setAutoCommit(false);
		pstmt1=con.prepareStatement("insert into jdbc23.student values(?,?,?)");
		pstmt2=con.prepareStatement("insert into jdbc23.student1 values(?,?,?)");
		Scanner s=new Scanner(System.in);
		System.out.println("enter name usn and marks of student ");
		String name=s.next();
		pstmt1.setString(1, name);
		int usn=s.nextInt();
		pstmt1.setInt(2, usn);
		double marks=s.nextDouble();
		pstmt1.setDouble(3, marks);
		pstmt1.execute();
		System.out.println("student data inserted");
		sp=con.setSavepoint();
		System.out.println("enter id name and pnumber of student1 ");
		int id=s.nextInt();
		pstmt2.setInt(1, id);
		
		String name1=s.next();
		pstmt2.setString(2, name1);
		
		double pnum=s.nextDouble();
		pstmt2.setDouble(3, pnum);
		pstmt2.execute();
		System.out.println("student1 data inserted");
		con.commit();
	} catch (ClassNotFoundException | SQLException e) {
		try {
			con.rollback(sp);
			con.commit();
			System.out.println("roll back done");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.printStackTrace();
	}
	finally {
		if(con!=null&&pstmt1!=null&&pstmt2!=null) {
			try {
				con.close();
				pstmt1.close();
				pstmt2.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
