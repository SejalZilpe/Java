package thirdDay;

public class MainInterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementation obj =new InterfaceImplementation();
		DataBase.dbConnect(); //italic since it is stataic
		obj.printData();
		obj.checkConnection();
		

	}

}
