package thirdDay;

public class InterfaceImplementation implements DatabaseSQL{

	
	@Override
	public void printData() {
		// TODO Auto-generated method stub
		System.out.println("printing from db...");
	}

	@Override
	public void connectSql() {
		// TODO Auto-generated method stub
		System.out.println("connectin to sql...");
	}

	
}
