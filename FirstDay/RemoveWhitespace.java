package FirstDay;

public class RemoveWhitespace {

	public static void main(String[] args) {
		
		//-----------REMOVE ALL SPACES ----------------------
		
				String str1 = new String("this    is   us");
				str1=str1.replaceAll("\\s+","");
				System.out.println(str1);
				
				
	}

}
