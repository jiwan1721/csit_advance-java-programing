package FinalClass;

public class uninitialisedFinalvariable {
	final String name;
	final static int age;
	public uninitialisedFinalvariable() {
		// TODO Auto-generated constructor stub
		name = "jiwan chanad ji"; //final variable can initialised inside a constructor
	}
	static {
		age = 101;//to use static block the variable must be declared final static
	}
	void getName() {
		System.out.println("this name is: " +name);
		System.out.println("the age is : " + age);
		
	}
	public static void main(String[] args) {
		new uninitialisedFinalvariable().getName();
	}

}
