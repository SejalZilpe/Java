package SecondDay;

public class SalaryAccount extends SBAccount{
	
	float minbal =0, interest = 6.5f;
	@Override
	public void calculateIntrest()
	 {
		 if(ndays > 30)
		 {
			 avlbal =avlbal + (avlbal * 0.065f);
			 ndays -= 30;
		 }
		 System.out.println(" updated balance is  : "+avlbal);
	 }
	
	

}
