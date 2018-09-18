package SecondDay;

public class SBAccount extends Account{

	float minbal=100;
	int ndays;
	public float readval()
	{
		System.out.println("Enter the available balance : ");	
		avlbal = sc.nextFloat();
		System.out.println(" number of days :");
		ndays = sc.nextInt();
		return avlbal;
	}
	
	public void checkBal()
	{
		if(avlbal<minbal)
		{
			System.out.println("the available balance is less than "+minbal);
			avlbal = avlbal-25;
			System.out.println("charge 25 as fine ");
			
		}
			
	}
	 public void calculateIntrest()
	 {
		 if(ndays > 30)
		 {
			 avlbal =avlbal + (avlbal * 0.06f);
			 ndays -= 30;
		 }
		 System.out.println(" updated balance is  : "+avlbal);
	 }
	 
}
