package usingClass;

public class Main {

	public static void main(String[] args) {
		
		
		// Using thread class
		
		ThreadOne threadone=new ThreadOne();
		ThreadTwo threadtwo=new ThreadTwo();
		
		threadone.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		threadtwo.start();
		
	
	}

}
