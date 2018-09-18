package FirstDay;

public class Phone {
	int dial;
	int disconnect;
	public void makeCall()
	{
		if(dial==1)
			System.out.println("calling");
		else
			System.out.println("user busy");
	}
}
