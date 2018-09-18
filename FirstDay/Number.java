package FirstDay;
import java.util.*;
public class Number {

	public static void main(String[] args) {
		
		int num,temp = 0,sum=0,number,mul;
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("enter the number to test for neon :");
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
*/
		///------------------------------------------
		
		/*System.out.println("entre a number to test for strong : ");
		number = sc.nextInt();
		num=number;
		while(num >= 1)
		{
			temp = num % 10;
			System.out.println(temp);
			sum=sum+fact(temp);
			num = num / 10;
		}
		if(number == sum)
		{
			System.out.println(number+" is a strong number ");
		}
		else
		{
			System.out.println(number+" is not a strong number ");
		} */
		
		//--------------------------------------------
		
		/*System.out.println("entre a number to test for automorphic : ");
		number = sc.nextInt();
		mul=number*number;
		if(mul%10==number)
		{
			System.out.println(number+" is a automorphic number ");
		}
		else
		{
			System.out.println(number+" is not a automorphic number ");
		} */
		  
		//----------------------------------------------------
		mul=1;
		System.out.println("entre a number to test for spy : ");
		number = sc.nextInt();
		num=number;
		while(num >= 1)
		{
			temp = num % 10;
			sum=sum+temp;
			mul=mul*temp;
			num = num / 10;
		}
		if(mul == sum)
		{
			System.out.println(number+" is a spy number ");
		}
		else
		{
			System.out.println(number+" is not a spy number ");
		} 
	}

public static int fact(int temp)
{
	int value = 0;
	if(temp==1)
		value=1;
	if(temp==0)
		value=1;
	if(temp>=2)
	{
		value=temp*fact(temp-1);
	}
	return value;
}
}
