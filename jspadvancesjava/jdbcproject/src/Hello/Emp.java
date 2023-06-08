package Hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Emp {
public static void main(String[] args) {
     String  url="jdbc:mysql://localhost:3306/mobile";
     String username="root";
     String password="vijay7991@arik";
//     String query="update mobile set color='blue' where mid=312";
//     String query="create table hero (id"
     String query="select color from mobile where mid=312";
     
    		 
    		 
     try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url,username,password);
	     PreparedStatement  pstmt= conn.prepareStatement(query); 
	   ResultSet rs=pstmt.executeQuery();
	   String s1= rs.getString(2);
		System.out.println(s1);
		System.out.println("inserted");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
}
}
