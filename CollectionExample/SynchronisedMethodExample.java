package CollectionExample;

public class SynchronisedMethodExample {

	public synchronized void readval()
	{
		System.out.println("reading the value");
	}
	public synchronized void printval()
	{
		System.out.println("printing the value");
	}
	public static void main(String[] args)
	{
		SynchronisedMethodExample sme = new SynchronisedMethodExample();
		sme.readval();
		sme.printval();
	}
}
