package concurrncy;

public class setPriorityOfThreadClass extends Thread{
	public void run() {
		System.out.println(currentThread().getName()+" is running");
		System.out.println(currentThread().getPriority()+" is running priority");
	}
	public static void main(String[] args) {
		setPriorityOfThreadClass thread1 = new setPriorityOfThreadClass();
		setPriorityOfThreadClass thread2 = new setPriorityOfThreadClass();
		setPriorityOfThreadClass thread3 = new setPriorityOfThreadClass();
		//thread1.setPriority(MIN_PRIORITY);//1
		//thread2.setPriority(MAX_PRIORITY);//10
		//thread3.setPriority(NORM_PRIORITY);//5
		thread1.setPriority(10);//priority value 10
		thread2.setPriority(6);//priority value 6
		thread3.setPriority(3);//prority value 3
		thread1.start();//run
		thread2.start();//run
		thread3.start();//run
		
	}

}
