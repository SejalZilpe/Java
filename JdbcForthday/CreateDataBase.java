package JdbcForthday;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class CreateDataBase extends DBConnect{

	public Connection conn = null;
	public void createTable()
	{
		try
		{
			conn = DBConnect.connectiontodatabase();
			if(conn == null)
			{
				System.out.println("connection not establish ");
			}
			else
			{
				Statement st = conn.createStatement();
				String str = "create table school(roll int,name varchar(20))";
				st.executeUpdate(str);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void InsertInTable()
	{
		try
		{
			conn = DBConnect.connectiontodatabase();
			if(conn == null)
			{
				System.out.println("connection not establish ");
			}
			else
			{
				
				String str = "insert into school values(?,?)";
				PreparedStatement pst = conn.prepareStatement(str);
				Scanner sc = new Scanner(System.in);
				System.out.println("enter roll number and name : ");
				int roll = sc.nextInt();
				String name = sc.next();
				pst.setInt(1, roll);
				pst.setString(2, name);
				int n = pst.executeUpdate();
				if(n>0)
				{
					System.out.println("row inserted");
				}
				else
				{
					System.out.println("row not inserted ");
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
