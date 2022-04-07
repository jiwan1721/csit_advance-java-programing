import java.sql.DriverManager;

public class Database {
	public Database() {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String serverString = "//DESKTOP-BC3QO4B\\SQLEXPRESS";
		String databaseString = "Studentdb";
		int port = 1433;
		String jdbcString = "jdbc:sqlserver:" + serverString + ":" + port + ";databaseName=" + databaseString
				+ ";integratedSecurity=true";
		connection = DriverManager.getConnection(jdbcString);
		System.out.println("Database connection done");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
