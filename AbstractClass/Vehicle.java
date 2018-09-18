package AbstractClass;

public abstract class Vehicle {
	public void start()
	{
		System.out.println("start vehicle");
	}

	public void stop()
	{
		System.out.println("stop vehicle");
	}

	public abstract void changeGear();
}
