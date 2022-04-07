package concurrncy;

class darshan implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i <10; ++i) {
			System.out.println("darshan hajur....");
			try {Thread.sleep(2000);}
			catch (InterruptedException ex) {
				
			}
		}
		
	}
	
}
class namaste implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i <10; ++i) {
			System.out.println("Namaste Sir...");
			try {Thread.sleep(2000);}
			catch (InterruptedException ex) {
				
			}
		}
		
		
	}
	
}

public class UsingMultiThreadWithRunnableInterface {

	public static void main(String[] args) {
		//darshan drsnhjr = new darshan();
		//namaste nams = new namaste();
		//Thread t1 = new Thread(drsnhjr);
		//Thread t2 = new Thread(nams);
		Thread t1 = new Thread(new darshan()); //yo chai anonymous inner class
		Thread t2 = new Thread(new namaste());//use gareko
		t1.start();
		t2.start();  //parallel execution of two different threads

	}

}
