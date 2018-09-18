package ExceptionHandling;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val;
		Scanner sc = new Scanner(System.in);
		val = sc.nextInt();
		try {
			
			if(val%2!=0)
			{
				throw(new OddNumberException());
			}
			else
			{
				System.out.println("number is even ");
			}
		}catch(OddNumberException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("end of program ");
		}
		
	}

}
