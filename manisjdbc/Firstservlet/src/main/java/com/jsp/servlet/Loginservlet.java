package com.jsp.servlet;



/*package com.jsp.servlet;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Loginservlet extends HttpServlet{
 public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	 String email=req.getParameter("eml");
	 String password=req.getParameter("pas");
	PrintWriter out= resp.getWriter();
	out.print("<html><body><h2>login successful "+email+"</h2></body></html>");
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver class loaded ");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=vijay7991@arik");
		PreparedStatement pstmt=con.prepareStatement("select * jdbc23.user where email=? and password=?");
		pstmt.setString(1, email);
		pstmt.setString(2, password);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			out.print("<html><body bgcolor='yellow'><h2>login successful ok </h2></body></html>");
		}else {
			out.print("<html><body bgcolor='green'><h2>login successful ok </h2></body></html>");
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}*/
//life cycle of servlet
import java.io.IOException;
import java.io.PrintWriter;

import javax.*;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Loginservlet extends GenericServlet{

	public Loginservlet() {
		System.out.println("servletobject created");
	}
	public void init(ServletConfig config) {
		System.out.println("servlet object is configured");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("running service phase");
		String email=req.getParameter("eml");
		String password=req.getParameter("pas");
		PrintWriter out=res.getWriter();
		out.print("<html><body><h1>login is done ok</h1></body></html>");
		out.flush();
	}
	public void destroy() {
		System.out.println("object is not destroyed all costly resources closed");
	}
	
}



















