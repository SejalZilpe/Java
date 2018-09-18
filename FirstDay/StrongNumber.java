package FirstDay;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,temp = 0,sum=0,number,mul;
		Scanner sc = new Scanner(System.in);

		System.out.println("entre a number to test for strong : ");
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
