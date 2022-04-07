package inheritance;

class Base{
	void method() {
		System.out.println("I am base class method");
	}
}
class Derived extends Base{
	@Override
	void method() {
		System.out.println("I am derived class method");
	}
}
class SubDerived extends Derived{
	@Override
	void method() {
		System.out.println("I am subderived class method");
	}
}
public class Upcastingdy {
	public static void main(String[] args) {
		Base d = new SubDerived();//upcasting
		d.method();
	}
}
