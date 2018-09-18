package FirstDay;

import java.util.Scanner;

import thirdDay.DataBase;

public class NeonNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,temp = 0,sum=0,number,mul;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number to test for neon :");
		num = sc.nextInt();
		mul = num*num;
		System.out.println("square of "+num+" is "+mul);
		while(mul >= 1)
		{
			temp = mul % 10;
			sum=sum+temp;
			mul = mul / 10;
		}
		if(num == sum)
		{
			System.out.println(num+" is a neon number ");
		}
		else
		{
			System.out.println(num+" is not a neon number ");
		} 
		
	}

	

}
