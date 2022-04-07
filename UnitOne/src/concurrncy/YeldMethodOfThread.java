package concurrncy;

public class YeldMethodOfThread extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}

	public static void main(String[] args) {
		YeldMethodOfThread one = new YeldMethodOfThread();
		one.start();
		Thread.yield();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " under control");
		}
	}

}