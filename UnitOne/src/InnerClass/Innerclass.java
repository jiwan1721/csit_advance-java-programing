package InnerClass;

class OuterClass {
	int x = 10;
	class InnerClass {
		int y = 5;
	}
}

public class Innerclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);

	}

}
