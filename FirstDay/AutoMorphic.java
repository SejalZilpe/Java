package FirstDay;

import java.util.Scanner;

public class AutoMorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,temp = 0,sum=0,number,mul;
		Scanner sc = new Scanner(System.in);
		
		number = sc.nextInt();
		mul=number*number;
		if(mul%10==number)
		{
			System.out.println(number+" is a automorphic number ");
		}
		else
		{
			System.out.println(number+" is not a automorphic number ");
		} 
		
	}

}
