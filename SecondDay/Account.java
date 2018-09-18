package SecondDay;

import java.util.Scanner;

public class Account {
	
	Scanner sc = new Scanner(System.in);
	//Instance variable or class variable
	public float minbal, avlbal, withdrawbal,depositbal;
	public String acctype;
	
	//Instance method
	
	
	
	public void withdraw()
	{
		System.out.println("Enter the money to withdraw : ");		
		withdrawbal = sc.nextFloat();
		if((avlbal==0)||(avlbal<withdrawbal))
		{
			System.out.println("insufficient balance ");
		}
		else
		{
			avlbal = avlbal - withdrawbal;
			System.out.println("transaction successful ");
		}
	}
	
	public void deposit()
	{
		System.out.println("Enter the money to deposit : ");		
		depositbal = sc.nextFloat();
		if(depositbal==0)
		{
			System.out.println("insufficient balance ");
		}
		else
		{
			avlbal = avlbal + depositbal;
			System.out.println("transaction successful ");
			System.out.println("available balance is "+avlbal);
		}
	}
	
}
