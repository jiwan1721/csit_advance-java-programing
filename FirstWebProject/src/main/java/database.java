
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class database extends HttpServlet {
	static ResultSet rsltset;
	static Statement statement;
	static Connection con;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Checking the database connection");
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String server = "//DESKTOP-3MRR1FU\\SQLEXPRESS";
			String database = "College_db";
			int port = 1433;
			String jdbcurl = "jdbc:sqlserver:" + server + ":" + port + ";databaseName=" + database
					+ ";integratedSecurity=true";
			con = DriverManager.getConnection(jdbcurl);// connection to database
			System.out.println("Database Obtained");
			statement = con.createStatement();
			System.out.println("Statement is created");
// Creating a table Login in database CollegeDb
			String createTable = "CREATE TABLE Login" + "" + "(UserId varchar(100)," + "Password varchar(255)" + ");";
			statement.executeUpdate(createTable);
			System.out.println("Table created Successfully");
			String uname = request.getParameter("txtid");
			String pwd = request.getParameter("txtpass");
			out.print("<h2>Welcome" + uname + "<br>" + pwd + "</h2>");
			String insertdata = "INSERT INTO Login VALUES('" + uname + "','" + pwd + "')";
			statement.executeUpdate(insertdata);
			System.out.println("Data inserted Successfully");
		} catch (SQLException ex) {
			out.println(ex.getMessage());
		} catch (ClassNotFoundException nex) {

			out.println(nex.getMessage());
		}
	}
}
