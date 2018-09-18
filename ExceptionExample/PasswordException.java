package ExceptionExample;


import java.util.Scanner;



public class PasswordException {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		int i=0,flagsymbol=0,flagnum=0;
			try {
			
			if(str.length()<8)
			{
				throw(new PasswordExceptionValidate());
			}
			else
			{
				for(i=0;i<str.length();i++)
				{
					if(arr[i]=='@' || arr[i]=='$' || arr[i]=='&') {
						flagsymbol=1;
						break;
					}	
				}
				for(i=0;i<str.length();i++)
				{
					if(arr[i]=='@' || arr[i]=='$' || arr[i]=='&') {
						flagnum=1;
						break;
					}	
				}
				if(flagsymbol == 1 && flagnum == 1 )
				{
					System.out.println("password saved  ");
				}
				else
				{
					throw(new PasswordExceptionValidate());
				}
			}
		}catch(PasswordExceptionValidate e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("end of program ");
		}
		
		
	}

}
