package dataProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	Connection connection;

	public dbConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String serverString = "//DESKTOP-BC3QO4B\\SQLEXPRESS";
		String databaseString = "Studentdb";
		int port = 1433;
		String jdbcString = "jdbc:sqlserver:" + serverString + ":" + port + ";databaseName=" + databaseString
				+ ";integratedSecurity=true";
		connection = DriverManager.getConnection(jdbcString);
		System.out.println("Database connection done");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new dbConnection();
	}
}
