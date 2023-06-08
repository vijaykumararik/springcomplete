package std;

import java.sql.*;

public class Student {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/airfort";
	String username="root";
	String password="vijay7991@arik";
//	String query="insert into student values(8,85,'kijay','india')";
//	String query1="insert into student values(10,59,'aijay','india')";
	String table="create table fligt"
     		+ "(fno int,fname varchar(20),fdestination varchar(20))";
	try {
		//1.load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.establish connection 
		Connection conn= DriverManager.getConnection(url,username,password);
		//3.create statement
		Statement stmt =conn.createStatement();
		//4.execute statement
		stmt.execute(table);
//		stmt.execute(query1);
		//5.close connection
		stmt.close();
		conn.close();
		System.out.println("inserted");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

}
