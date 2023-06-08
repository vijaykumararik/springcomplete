package com.jsp.servlet;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet{
 public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
	 //to get data from frount end
	 String fname=req.getParameter("fnm");
	 String lname=req.getParameter("lnm");
	 String email=req.getParameter("em");
	 String phone=req.getParameter("ph");
	 String addres=req.getParameter("add");
	 
	PrintWriter out= resp.getWriter();
	out.print("<html><body bgcolor='blue'><h1>data added succesfully "+fname+
			"</h1></body></html>");
	out.flush();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=vijay7991@arik");
		PreparedStatement pstmt=con.prepareStatement("insert into jdbc23.user values(?,?,?,?,?)");
		pstmt.setString(1, fname);
		pstmt.setString(2, lname);
		pstmt.setString(3, email);
		pstmt.setString(4, phone);
		pstmt.setString(5, addres);
		pstmt.execute();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }
}
