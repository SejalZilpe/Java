package FirstDay;

public class CheckRotation {

	public static void main(String[] args) {
		
		// ---------CHECK ROTATION OF STRING---------
		
		String string1 = new String("javuj2ee");
		String string2 = new String("j2eejava");
		System.out.println(string1);
		System.out.println(string2);
		String sub1string1 = string1.substring(0,3); 
		String sub2string1 = string1.substring(4,7); 
		String sub1string2 = string2.substring(0,3);
		String sub2string2 = string2.substring(4,7);
		if(sub1string1.contentEquals(sub2string2) && sub2string1.contentEquals(sub1string2))
		{
			System.out.println("it is rotation of each other");
		}
		else
		{
			System.out.println("it is not rotation of each other");
		}

	}

}
