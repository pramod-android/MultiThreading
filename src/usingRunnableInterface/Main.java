package usingRunnableInterface;

import usingRunnableInterface.Thread1;
import usingRunnableInterface.Thread2;

public class Main {

	public static void main(String[] args) {
		
	// Using Runnable Interface
		
		Runnable obj1=new Thread1();
		Runnable obj2=new Thread2();
		
		Thread thread1=new Thread(obj1);
		Thread thread2=new Thread(obj2);
		
		
		thread1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		thread2.start();
	}

}
