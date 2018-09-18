package inheritanceexample;

public class B extends A {
	
	/*B()
	{
		System.out.println("class B constructor ");
	}
	B(int a)
	{
		System.out.println("class B parameterised constructor "+a);
	}
	B(B c)
	{
		System.out.println("class B copy constructor ");
	}*/
	B()
	{
		super();
		super.a=30;
		super.readval();
	}
	
void callSuperMethod()
{
	super.readval();
}
	/*public void readval()
	{
		System.out.println("this is class B");
	}*/

}
