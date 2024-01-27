package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	Connection con;
	String dbname = "demo";
	String dbuser = "root";
	String dbpassword = "";
	
	public Connection getConnection()throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost"+dbname, dbuser, dbpassword);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
//	public static void main(String[] args)  {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con;
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","");
//		System.out.print("Database Connected");
	}


