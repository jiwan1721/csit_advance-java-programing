package dataProject;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class prepardStatementDemonstration {
	Statement statement;
	Connection connection;
	ResultSet set;
	PreparedStatement pStatement;

	public prepardStatementDemonstration() {
		// TODO Auto-generated constructor stub
		Database db = new Database();
		connection = db.getConnection();
		statement = connection.createStatement();
		String insertiongString =  "INSERT"
		
	}

}
