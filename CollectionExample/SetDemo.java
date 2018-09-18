package CollectionExample;

import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Float> hs = new HashSet<Float>();
		hs.add(3.14f);
		hs.add(0.612f);
		hs.add(0.612f); //duplicat value
		hs.add(9.14f);
		hs.add(18.612f);
		hs.add(null);
		System.out.println(hs);
		
		//treeset is sorted
		
		TreeSet<Float> ts = new TreeSet<Float>();
		ts.add(3.14f);
		ts.add(0.612f);
		ts.add(0.612f); //duplicat value
		ts.add(9.14f);
		ts.add(18.612f); // do not allow null value
		System.out.println(ts);
	}

}
