package usingClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadOne threadone=new ThreadOne();
		ThreadTwo threadtwo=new ThreadTwo();
		
		threadone.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadtwo.start();
	}

}
