package jkdbcTask2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTale {

	public static void main(String[] args) {
			try {
				//load the driver
				Class.forName("org.h2.Driver");
				//establish connection
				Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","root","test");
				//write query
				/*String query = "create table gameofthrone(id int,character varchar(40),house varchar(40))";
				Statement statement= conn.createStatement();
				statement.executeUpdate(query);*/
				
				Scanner scanner =new Scanner(System.in);
				//String query1 = "insert into gameofthrone values(?,?,?)";
				String query1 = "insert into gameofthrone values(?,?,?)";// --- to insert selected items in table
				PreparedStatement pst = conn.prepareStatement(query1);
				System.out.println("enter id , character ,  house :");
				
				int id =scanner.nextInt();
				//String character = scanner.next();
				String house = scanner.next();
				
				pst.setInt(1,id);
				pst.setString(2, "");
				pst.setString(3, house);
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
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
			
		}

	}
