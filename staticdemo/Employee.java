package staticdemo;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Employee {

	String name;
	String eid;
	static String company;
	
	Scanner sc = new Scanner(System.in);
	static
	{
		System.out.println("Employee ststic block");
	}
	void readval()
	{
		System.out.println("enter emp value ");
		System.out.println("enter id ");
		eid = sc.next();
		System.out.println("enter name :");
		name = sc.next();
		System.out.println("enter company :");
		company = sc.next();
	}
	void printval()
	{
		System.out.println("employee id : "+eid);
		System.out.println("employee name : "+name);
		System.out.println("employee company : "+company);

	}
	static void calculate()
	{
		System.out.println("this is salary");
	}
	
}
