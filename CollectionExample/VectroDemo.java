package CollectionExample;

import java.util.Vector;

public class VectroDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vec = new Vector<String>();
		vec.add("Hanna");
		vec.add("Aria");
		vec.add("Emily");
		vec.add("Spencer");
		System.out.println(vec); // output is like this -->  [Hanna, Aria, Emily, Spencer]
		vec.addElement("Alison");
		for(String a:vec)
		{
			if(a.equals("Hanna"))
			{
				System.out.println("haleb is endgame");
			}
			System.out.println(a);
		}
		
		
	}

}
