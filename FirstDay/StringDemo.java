package FirstDay;


public class StringDemo {

	public static void main(String[] args) {
		//first way
		String s;
		String strLiteral = "This is a string. ";
		String strLiteral2 = "This is a string. ";
		//second way
		String s1 = new String();
		String s1new = new String("String in java.");
		//third way
		char name[] = new char[20];
		String s2 = new String(name);//now character array becamme a string
		
		System.out.println(strLiteral);
		System.out.println(s1new);
		System.out.println("charater at 5th indices is "+strLiteral.charAt(5));
		System.out.println("length of string is "+strLiteral.length());
		System.out.println("concat : "+strLiteral.concat(s1new));
		System.out.println("substrin of the given string : "+strLiteral.substring(5,10));
		System.out.println("substrin of the given string : "+strLiteral.substring(5,strLiteral.length()));
		System.out.println("compare to: "+strLiteral.compareTo(s1new));
		System.out.println("equals to: "+strLiteral.equals(s1new));
		System.out.println("compare to: "+strLiteral.compareTo(strLiteral2));
		System.out.println("equals to: "+strLiteral.equals(strLiteral2));
		System.out.println("index of s: "+strLiteral.indexOf("s"));
		System.out.println("last index of s : "+strLiteral.lastIndexOf("s"));
		System.out.println("contains : "+strLiteral.contains("str"));
		System.out.println("content equals : "+strLiteral.contentEquals("string"));
		System.out.println("hashcode of strliteral : "+strLiteral.hashCode());
		System.out.println("hashcode of strliteral2: "+strLiteral2.hashCode());
		System.out.println("trim  strliteral2: "+strLiteral2.trim().length());
		
		String[] sptoken = strLiteral.split(" ");
		for(String st:sptoken)
		System.out.println(st);
		char[] ch = strLiteral.toCharArray();
		for(char c :ch)
		System.out.println(c);
		
		System.out.println("unocode value at strliteral[5] is "+strLiteral.codePointAt(5));//return unicode value
		System.out.println("reigon matches : "+strLiteral.regionMatches(5, "is a string. ", 5, 17));


	}

}
