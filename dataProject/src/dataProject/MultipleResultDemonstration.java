package dataProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MultipleResultDemonstration {
	Connection con;
	Statement statement;
// ResultSet set;

	public MultipleResultDemonstration() throws ClassNotFoundException, SQLException {
		Database db = new Database();
		con = db.getConnection();
		statement = con.createStatement();
		int rscount = 0;
// Multiple Statements
		String ms = "SELECT * FROM Abc_tbl WHERE name LIKE 'S%';" + "SELECT * FROM Abc_tbl WHERE name LIKE '%a';";
		boolean result = statement.execute(ms);// execute for multiple statement
		do {
			if (result) {
				ResultSet set = statement.getResultSet();// obtain how many resultset are there
				rscount++;
				System.out.println("Resultset#:" + rscount);
				while (set.next()) {
					System.out.println("Name:" + set.getString("name"));
					System.out.println("Name:" + set.getString("id"));
				}
				set.close();
				result = statement.getMoreResults();
			}
		} while (result);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new MultipleResultDemonstration();
	}
}
