package concurrncy;

public class stopMethodOfThreadclass extends Thread{
	public void run() {
		for(int i = 1; i < 5; i++) {
			try {
			sleep(1000);
			} catch (InterruptedException e) {
				
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		stopMethodOfThreadclass thread1 = new stopMethodOfThreadclass();
		stopMethodOfThreadclass thread2 = new stopMethodOfThreadclass();
		thread1.start();
		thread2.start();
		thread2.stop(); //thread kill--may hamper other thread so, stop is deprecated
		System.out.println("thread2 is stopped");
	}

}
