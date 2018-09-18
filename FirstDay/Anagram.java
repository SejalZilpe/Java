package FirstDay;
import java.util.*;
import java.lang.*;


public class Anagram {

	public static void main(String[] args) {
		
		 //------------TO FIND ANAGRAM OR NOT-----------
		
		String string1 = new String("sileut");
		String string2 = new String("listen");
		int i,flag=0;
		char[] arr1 = string1.toCharArray();
		char[] arr2 = string2.toCharArray();
		String sortarr1,sortarr2;
		
		if(string1.length() == string2.length())
		{
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(i=0;i<string1.length();i++)
			{
				if(arr1[i]==arr2[i])
					flag=1;
				else 
				{
					flag=0;break;
				}
			}		
		}
		else
		{
			flag=0;
		}
		if(flag==1)
			System.out.println("it is an anagram ");
		else
			System.out.println("it is not an anagram ");
		
		
		
		
	}

}
