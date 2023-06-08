package com.jsp.program;
import java.sql.*;
import java.util.Scanner;
public class Fetchingdata {
public static void main(String[] args) {

	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String fetchquery="select * from jdbc23.student where usn=?";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class registerd");
		con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306?user=root&password=vijay7991@arik");
		System.out.println("connection established");
		pstmt=con.prepareStatement(fetchquery);
		System.out.println("platform created");
		System.out.println("seting data into palaceholder");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter usn u need to featch data");
		int usnno=sc.nextInt();
		pstmt.setInt(1, usnno);
		rs=pstmt.executeQuery();
		if(rs.next())
		{
			int usn=rs.getInt("usn");
			String name=rs.getString(1);
			double marks=rs.getDouble(3);
			System.out.println("usn: "+usn+" name: "+name+" marks: "+marks);
		}
		else {
			System.out.println("no record found");
		}
		sc.close();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		if(con!=null&&pstmt!=null&&rs!=null)
		{
			try {
				con.close();
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			System.out.println("costly resource is closed");
		}
	}
}
}
