package GarbageCollection;

public class GCExample {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		
		GCExample gce = new GCExample();
		gce.finalize();
		//System.gc();
		Runtime.getRuntime().gc();
		System.out.println("garbage collected");
	}

}
