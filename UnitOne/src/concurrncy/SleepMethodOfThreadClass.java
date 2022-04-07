package concurrncy;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class SleepMethodOfThreadClass extends Thread {
	public void run() {
		for(int i = 0; i < 20; i++) {
			try {
				sleep(1000, 1000); //wait 5 sec
			} catch (InterruptedException ex) {
				
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SleepMethodOfThreadClass t1 = new SleepMethodOfThreadClass();
		SleepMethodOfThreadClass t2 = new SleepMethodOfThreadClass();
		t1.start();
		t2.start();
	}
	

}
