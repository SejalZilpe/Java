package FirstDay;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,temp = 0,sum=0,number,mul;
		Scanner sc = new Scanner(System.in);
		
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

}
