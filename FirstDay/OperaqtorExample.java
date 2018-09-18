package FirstDay;
import java.util.*;
//all the classesand inetrface will be refrenced

public class OperaqtorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int i=10;
		//post increment
		System.out.println(i++);
		//post decrement
		System.out.println(i--);
		//pre increment
		System.out.println(++i);
		//pre decrement
		System.out.println(--i);*/
		//--------------------------------------
 		/*int i=6, j=2;
 		System.out.println(i & j);
 		System.out.println(i | j);
 		System.out.println(i ^ j);
 		System.out.println(i>>2);
 		System.out.println(i<<2);
 		System.out.println(~i);
 		i &= j;
 		System.out.println(i & j);*/
 		//----------------------------------------
		/*int i = 10,j = 2;
		if(i!=0)
		{
			if(i>2)
			{
				System.out.println("I is greater than J. ");
			}
			else
			{
				System.out.println("I is less than J. ");
			}
		}
		else
		{
			System.out.println("I is zero. ");
		}
		System.out.println("out of if");*/
 		//------------------------------------------
 		/*System.out.println(Math.max(23.5555, 6.999));
 		System.out.println(Math.sin(45));
 		System.out.println(Math.cos(45));
 		System.out.println(Math.tan(45));
 		System.out.println(Math.floor(4.5));
 		System.out.println(Math.round(4.5));
 		System.out.println(Math.ceil(4.5));
 		System.out.println(Math.toDegrees(45));*/
 		//------------------------------------------
		/*int i,k;
		float j;
		short l;
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter the values : ");
 		i = sc.nextInt();
 		j = sc.nextFloat();
 		k = (int)sc.nextFloat();
 		l =  (short)sc.nextInt();
 		System.out.println("i= "+i+ "\t\tj= " +j+ "\t\tk= "+k+"\t\tl= "+l);
 		while(j<i)
 		{
 			System.out.println(j);
 			j++;
 		}
 		sc.close();*/
		//---------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice : ");
		System.out.println("1.Addition ");
		System.out.println("2.Substraction ");
		System.out.println("3.Multiplication ");
		char ch = sc.next().charAt(0);
		System.out.println("Enter the number :");
		int i, j ;
		i = sc.nextInt();
		j = sc.nextInt();
		switch(ch)
		{
		case 'a':
			System.out.println(i+j);break;
		case 's':
			System.out.println(i-j);break;
		case 'm':
			System.out.println(i*j);break;
		default:
			System.out.println("not a valid choice ");break;		
		}
	}

}
