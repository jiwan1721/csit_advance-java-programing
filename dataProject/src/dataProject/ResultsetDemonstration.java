package dataProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetDemonstration {
	Connection con;
	Statement statement;

	public ResultsetDemonstration() throws ClassNotFoundException, SQLException {
		Database db = new Database();
		con = db.getConnection();
// Additional properties of ResultSet
		statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet set = statement.executeQuery("SELECT * FROM Abc_tbl");
// update the row data
		set.absolute(2);// table's second row data
		set.updateInt("id", 12);// it updates the id(2) to id(12)
		set.updateRow();// execute the above methods
		set.relative(-1);
		set.updateInt("id", 11);// it updates the id(2) to id(12)
		set.updateRow();// execute the above methods

// reading the data from table using REsultSet properties
		set.first();
		readStudent("first()", set);
		set.last();
		readStudent("last()", set);
		set.previous();
		readStudent("previous()", set);
	}

	private void readStudent(String method, ResultSet set) throws SQLException {
		int id = set.getInt("id");
		String name = set.getString("name");
		String studentinfo = "%s:%d-%s \n";
		System.out.format(studentinfo, method, id, name);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new ResultsetDemonstration();
	}
}
