package Overriding;

public class ConstructorOverloading {
	int length, breadth;
	public ConstructorOverloading() {
		//default constructor
		length = 0;
		breadth = 0;
	}
	public ConstructorOverloading(int l, int b) {
		length = l;
		breadth = b;
	}
	public ConstructorOverloading(int l) {// parameterized cons
		length = breadth = l;
	}
	public int GetArea() {
		return length * breadth;
	}
	public static void main(String[] args) {
		ConstructorOverloading area1 = new ConstructorOverloading(25, 45);
		
		System.out.println("the area is: " +area1.GetArea());
	}

}
