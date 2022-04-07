package concurrncy;

import java.util.Scanner;

class noMultithereading implements Runnable {
	public void run() {
		try {
			System.out.println("thread" + Thread.currentThread().getId()+" is running");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is caught");
		}
	}
}

public class RunableInterfaceThread {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = input.nextInt();
		for(int i = 0; i < num; i++) {
			Thread objThread = new Thread(new noMultithereading());
			objThread.start();
		}
	}

}
