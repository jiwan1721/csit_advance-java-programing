package FinalClass;


public class InstanceCounter {
	private static int numInstances = 0;//static variable
	protected static int getCount() {
		return numInstances;//as we can use static variable inside static method
	}
	private static void addinstances() {
		numInstances++;
	}
	public InstanceCounter() {
		addinstances();//calling static method of instance counter
	}
	public static void main(String[] args) {
		//InstanceCounter obj = new InstanceCounter();
		System.out.println("the no of oject: " + getCount());
		for (int i = 0; i < 100; i++) {
			new InstanceCounter();
		}
		System.out.println("the no of bojects " + getCount());
		
		
	}

}
