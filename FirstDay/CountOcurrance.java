package FirstDay;
import java.util.*;
public class CountOcurrance {

	public static void main(String[] args) {
		
		//----- COUNT NUMBER OF OCCURANCE-----
		
		String string1 = new String("the vampire diaries ");
		int originallength = string1.length();
		System.out.println("length of string without 'a' ");
		int newlength = string1.replaceAll("a","").length();
		System.out.println("count of 'a' in string is "+ (originallength-newlength));
		
	}

}
