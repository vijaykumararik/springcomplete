package alpha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Appcreate {

	public void homePage() {
		System.out.println("*******************ALPHA BOOK*******************");
		System.out.println("   1.LOGIN");
		System.out.println("   2.SIGNUP");
		System.out.println("   3.EXIT");
		System.out.print("ENTER YOUR CHOICE : ");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		option(n);
		System.out.println("************************************************");
	}
	public void option(int n) {
		Scanner scan = new Scanner("System.in");

		switch(n) {
		case 1:
			login();
			break;
		case 2:
			signUp();
			break;
		case 3:
			exit();
			break;
		}
	}
	public void login() {
		Scanner scan=new Scanner(System.in);
		System.out.println("**************WELCOME TO ALPHA BOOK**************");
		System.out.print("\n   EMAIL ID  :");
		String email_id=scan.next();

		System.out.print("\n   PASSWORD  :");
		String password=scan.next();

		try {
			int c1=0,c2=0;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/alphabook","root","");
			String query1="select * from users";
			PreparedStatement pstat = conn.prepareStatement(query1);
			ResultSet rs =pstat.executeQuery();

			while(rs.next()) {

				if(email_id.equals(rs.getString(5))) {
					c1++;
					if(password.equals(rs.getString(6))) {
						c2++;
						System.out.println("************WELCOME "+rs.getString(1)+" "+rs.getString(2)+" *************");
						break;
					}
				}
			}

			if(c1==0) {
				System.out.println("EMAIL ID DOESN'T EXIST");
				homePage();
			}
			if(c2==0) {
				System.out.print("*******************ALPHA BOOK*******************\n");
				int c=0;
				for(int i=0;i<3;i++) {
					System.out.print("INCORRECT PASSWORD\n");
					System.out.print("    RE-ENTER PASSWORD  : ");
					password=scan.next();
					System.out.println();
					rs =pstat.executeQuery();
					while(rs.next()) {

						if(email_id.equals(rs.getString(5))) {

							if(password.equals(rs.getString(6))) {
								c++;
								System.out.println("************WELCOME "+rs.getString(1)+" "+rs.getString(2)+" *************");
								break;
							}
						}
					}
					if(c!=0) {
						break;
					}
				}
				if(c==0) {
					System.out.println("YOU HAVE ENTERED PASSWORD INCORRECTLY FOR 3 TIMES");
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void signUp() {
		Scanner scan=new Scanner(System.in);
		System.out.println("*******************ALPHA BOOK*******************");
		System.out.print("     FIRST NAME      :");
		String first_name =scan.next();

		System.out.print("\n     LAST NAME       :");
		String last_name =scan.next();

		System.out.print("\n     GENDER          :");
		String gender=scan.next();

		System.out.print("\n     CONTACT NUMBER  :");
		long contact_number=scan.nextLong();

		System.out.print("\n     EMAIL ID        :");
		String email_id=scan.next();

		System.out.print("\n     PASSWORD        :");
		String password=scan.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/alphabook","root","root");
			String query1="select email_id from users";
			PreparedStatement pstat = conn.prepareStatement(query1);
			ResultSet rs =pstat.executeQuery();
			boolean check=false;
			while(rs.next()) {

				if(email_id.equals(rs.getString(1))) {
					System.out.println("\n     Email Id already exist");
					check=false;
					break;
				}else {
					check=true;
				}
			}
			if(check==true) {
				try {

					String query="insert into users values(?,?,?,?,?,?)";
					pstat=conn.prepareStatement(query);
					pstat.setString(1,first_name);
					pstat.setString(2,last_name);
					pstat.setString(3, gender);
					pstat.setLong(4,contact_number);
					pstat.setString(5, email_id);
					pstat.setString(6, password);
					System.out.print("     1.SUBMIT\n");
					System.out.print("     2.CANCEL\n");
					int c=scan.nextInt();
					if(c==1) {
						pstat.executeUpdate();
						System.out.println("\n     successfully Signed Up");
					}
					if(c==2) {
						System.exit(0);
					}

				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	public void exit() {
		System.out.println("DENGUSKO");
		System.exit(0);
	}

	public static void main(String[] args) {
		Appcreate sm = new Appcreate();
		sm.homePage();
	}
}

