package CollectionExample;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f = 25.5f;
		// ArrayList al = new ArrayList();
		ArrayList<Integer> al = new ArrayList<Integer>(); // using generics in array list to restrict data in array list
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		System.out.println("before removal size "+al.size());
		al.remove(2);
		System.out.println("before removal size "+al.size());
		
		/*for(Integer o:al)
		{
			System.out.println(o);
		}*/
		
		System.out.println("is empty :"+al.isEmpty());
		System.out.println("index of al :"+al.indexOf(al));
		System.out.println("last index of al :"+al.lastIndexOf(al));
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(11);
		al1.add(12);
		al1.addAll(al);
		for(Integer o:al1)
		{
			System.out.print(o+"\t");
		}
		System.out.println();
		System.out.println("does al1 contain elements of al[2] :"+al1.contains(al.get(2)));
		System.out.println("does al contain elements of al1[0] :"+al1.contains(al1.get(0)));
		
		
		
	}

}
