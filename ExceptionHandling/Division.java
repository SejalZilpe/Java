package ExceptionHandling;

import java.util.Scanner;

public class Division {
	
	public void division() throws ArithmeticException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two values to divide : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b==0)
		throw(new ArithmeticException("error in line 14"));
		System.out.println(a/b);
		sc.close();
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Division d = new Division();
		try {
				d.division();
			}
			catch(ArithmeticException | StringIndexOutOfBoundsException ae)
			{
				ae.printStackTrace();
			}
		finally
		{
			System.out.println("end of program");
		}

		
	}

}
