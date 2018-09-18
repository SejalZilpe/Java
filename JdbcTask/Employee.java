package JdbcTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//load the driver
			Class.forName("org.h2.Driver");
			
			//establish connection
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","root","test");
			
			//write query
			//String query = "select * from newemployee";
			Scanner sc = new Scanner(System.in);
			System.out.println("enter employee name : ");
			String name = sc.next();
			String query2 = "update newemployee set salary=salary+(salary*0.15) where name=?";
			
			/*Statement statement= conn.createStatement();
			ResultSet rs = statement.executeQuery(query);*/
			
			PreparedStatement pst = conn.prepareStatement(query2);
			pst.setString(2,name);
			int n=pst.executeUpdate();
			if(n>0)
			{
				System.out.println("row updated");
			}
			else
			{
				System.out.println("row not updateded ");
			}
			
			/*while(rs.next())
			{
				System.out.print("employee ID = "+rs.getInt(1));
				System.out.print(" employee NAME = "+rs.getString(2));
				System.out.print(" employee SALARY = "+rs.getString(3));
				System.out.println("");
				//System.out.println(" employee LOCATION = "+rs.getString(4));
			}*/
			
			
			
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
		
	}

}
