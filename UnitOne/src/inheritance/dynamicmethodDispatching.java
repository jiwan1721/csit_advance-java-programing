package inheritance;
class Fruit {
	void display() {
		System.out.println("Display method of fruit");
	}
}

class Banana extends Fruit {
	@Override
	void display() {
		System.out.println("Display method of banana");
	}
}

class Cherry extends Fruit {
	@Override
	void display() {
		System.out.println("Display method of Cherry");
	}
}

public class dynamicmethodDispatching {

	public static void main(String[] args) {
		Fruit ref;// reference..points no where in a memory
		ref=new Fruit();
		ref = ref=new Fruit();
		ref.display();
		// Dynamic method dispatch
		ref = new Banana();//ref becomes object of banana class
		ref.display();// runtime method call---banana class

		ref = new Cherry();//ref becomes object of cherry class
		ref.display();
	}
}
