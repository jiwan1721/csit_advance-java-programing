package InnerClass;
abstract interface Test {
	public abstract void DisplayName(); 
}

public class anonnymous {
	public static void main(String[] args) {
		Test ainner = new Test() {
			public void DisplayName() {
				System.out.println("i m in ths class");
			}
		};
		ainner.DisplayName();
	}

}
