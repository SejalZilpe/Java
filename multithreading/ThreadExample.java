package multithreading;
/*
public class ThreadExample extends Thread{

	public void run()
	{
		System.out.println("thread running ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadExample tex = new ThreadExample();
		tex.start();
		Thread th = new Thread(tex); 
		th.run(); //this is thread object run method
	}

}
*/

public class ThreadExample implements Runnable{

	public void run()
	{
		System.out.println("thread running ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadExample tex = new ThreadExample();
		Thread th = new Thread(tex);
		th.start();
		System.out.println(th.getPriority());
		th.setPriority(3);
		System.out.println(th.isDaemon());
		th.setDaemon(true);
		System.out.println(th.isDaemon());
		//th.run(); //this is thread object run method
	}

	
}
