package inheritanceexample;

public class A {
	float a;
	A(float A)
	{
		this.a=a;
	}
	
	A()
	{
		System.out.println("class A constructor ");
	}
	A(int a)
	{
		System.out.println("class A parameterised constructor "+a);
	}
	public void readval()
	{
		System.out.println("this is class A");
	}
	void readval(int a)
	{
		System.out.println("this is overloading "+a);
	}
}
