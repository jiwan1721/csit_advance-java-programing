package FinalClass;

import InnerClass.staticclass;

public class StaticMethod {
	static int a,b;
	public static void Display() {
		a = 95;
		b = 34;
	    System.out.println(a + "and" + b);
	}
	public static void main(String[] args) {
		StaticMethod.Display();
	}

}
