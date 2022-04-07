package InnerClass;

public class Outerstatic_demo {
	static class Inner {
		public void Display() {
			System.out.println("how you doin");
		}
	}
	public static void main(String[] args) {
		//Outerstatic_demo = new Outerstatic_demo();
		Inner obj = new Inner();
		obj.Display();
	}

}
