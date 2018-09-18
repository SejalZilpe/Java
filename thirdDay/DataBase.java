package thirdDay;

public interface DataBase {
	
	//interface variables by deafult it is public static and final
	int x=10;
	
	public void printData();
	default void checkConnection() 
	{
		System.out.println("doing by default .. ");
	}
	static void dbConnect()
	{
		System.out.println("connecting to db...");
	}

}
