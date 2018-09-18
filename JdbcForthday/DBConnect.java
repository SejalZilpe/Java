package JdbcForthday;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static Connection conn=null;
	public static Connection connectiontodatabase() {
		try {
			//load the driver
			Class.forName("org.h2.Driver");
			//establish connection
			 conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","root","test");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	


}
