package staticdemo;

public class InclassOutclassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if inner clas has static keyword
		
		/*Oclass.Iclass one = new Oclass.Iclass();
		one.iclassMethod();*/
		
		
		// if inner class do not have static keyword
		Oclass os = new Oclass();
		Oclass.Iclass os2 = os.new Iclass();
		os2.iclassMethod();

	}

}
