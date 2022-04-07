package concurrncy;

class GoodOne extends Thread { // using thread class from java.lang package
	public void run() { // overriden method of thread class
		for (int i = 0; i < 5; i++) { // time to execute = 5 sec
			System.out.println("good");
			try {
				Thread.sleep(1000); // 1000 milliseconds = 1 second
			} catch (Exception e) {

			}

		}

	}
}

class MorningOne extends Thread { // using thread class from java.lang package
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) { // time to execute = 5 sec
			System.out.println("morning");
			try {
				Thread.sleep(1000); // 1000 milliseconds = 1 second
			} catch (Exception e) {

			}
		}
	}

}

public class UsingMultiThreadClass {
	public static void main(String[] args) {

		GoodOne Thread1 = new GoodOne();
		MorningOne Thread2 = new MorningOne();
		Thread1.start();
		Thread2.start();
	}

}
