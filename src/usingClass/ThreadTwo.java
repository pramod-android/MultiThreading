package usingClass;

public class ThreadTwo extends Thread{
	public void run() {
		
		for(int i=0;i<5;i++) {
		System.out.println("Hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
