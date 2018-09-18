package Jdbc;
import java.sql.*;
public class JdbcExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//load the driver
			Class.forName("org.h2.Driver");
			//establish connection
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","root","test");
			//write query
			String query = "select * from sample";
			Statement statement= conn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
		
	}

}
