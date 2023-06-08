package Prepaidstatement.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updatebyprepaid {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/rajkumar";
	String username="root";
	String password="vijay7991@arik";
	String query="update  punit set nimname=?,nimaddress=? where nimid=? ";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection(url,username,password);
	PreparedStatement pstmt =conn.prepareStatement(query);
	
	pstmt.setString(1, "rajahuli");
	pstmt.setString(2, "kashmir");
	pstmt.setInt(3, 200);
	pstmt.execute();
	conn.close();
	pstmt.close();
	System.out.println("done with your work");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
