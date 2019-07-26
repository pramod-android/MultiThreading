package usingLambdaExpression;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
	// Using Runnable Interface in anonymous class
		
	/*	
	 * Runnable obj1=new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Hii");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
			}
			
		};
		Runnable obj2=new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Hello!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
			}
			
		};
		Thread thread1=new Thread(obj1);
		Thread thread2=new Thread(obj2);
		
		*/
		
	 //  Runnable Interface is FunctionalInterface we can use Lambda expression here
		
		
	/*
	 * 	Runnable obj1=() ->{
	 
				for(int i=0;i<5;i++) {
					System.out.println("Hii");
					try {Thread.sleep(1000);} catch (InterruptedException e) {}
					}
			
		};
		Runnable obj2=() -> {
				for(int i=0;i<5;i++) {
					System.out.println("Hello!");
					try {Thread.sleep(1000);} catch (InterruptedException e) {}
					}
			
		};
		Thread thread1=new Thread(obj1);
		Thread thread2=new Thread(obj2);
		*/
		
	Thread thread1=new Thread(() ->{
			for(int i=0;i<5;i++) {
				System.out.println("Hii");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				}
		
	});
	Thread thread2=new Thread(() -> {
			for(int i=0;i<5;i++) {
				System.out.println("Hello!");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				}
		
	});
		
		
		thread1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		thread2.start();
		
		
		// Use of join and isAlive method
		// Join will wait until the thread execution will not complete 
		// isAlive will check that thread is running or not
		System.out.println(thread1.isAlive());
		thread1.join();
		thread2.join();
		System.out.println(thread1.isAlive());
		System.out.println("all threads are executed");
		
	}

}
