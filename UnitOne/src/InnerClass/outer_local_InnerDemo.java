package InnerClass;

public class outer_local_InnerDemo {
	public void MethodOuter() {
	    class LocalInner {
			void PrintMe() {
				System.out.println("This is local inner class method");
			}
		}
		LocalInner linner = new LocalInner();
		linner.PrintMe();
	}

	public static void main(String[] args) {
		outer_local_InnerDemo obj = new outer_local_InnerDemo();
		obj.MethodOuter();

	}

}
