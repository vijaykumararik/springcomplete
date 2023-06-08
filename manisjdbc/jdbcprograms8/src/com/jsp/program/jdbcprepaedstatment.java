package com.jsp.program;
import java.sql.*;
public class jdbcprepaedstatment {
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement pstmt=null;
	String inquery="insert into jdbc23.student values(?,?,?)";
//	String inquery="update jdbc23.student set marks=856.25 where usn=2 ";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver class loaded and registerd");
		con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306?user=root&password=vijay7991@arik");
		System.out.println("connection stablished between java application and database");
		pstmt=con.prepareStatement(inquery);
		System.out.println("platform created");
		System.out.println("seting values for place holder");
		pstmt.setString(1," Mr kimalaya");
		pstmt.setInt(2, 135);
		pstmt.setDouble(3, 8508.96);
		int e=pstmt.executeUpdate();
		System.out.println("record updated "+e);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {//7th step
		if(con!=null&&pstmt!=null)
		{
			try {
				con.close();
				pstmt.close();
				System.out.println("all costly resources are closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}
}
}
}
