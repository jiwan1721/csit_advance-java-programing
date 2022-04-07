package jdbc;

import java.sql.*;

public class DemoClass {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/data";
		String uname = "root";
		String pass = "server@123";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManger.getConnection(url,uname,pass);
		Statement st = con.createStatement();
	}

}
