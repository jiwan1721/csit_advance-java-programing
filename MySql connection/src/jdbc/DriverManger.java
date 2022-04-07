package jdbc;

import com.sun.jdi.connect.spi.Connection;

public class DriverManger{
	public static Connection getConnection(String url,
			java.util.properties info) throws SQLException {
		return(getConnection(url, info, Reflection.getCallerClass()));
	}
	

}
