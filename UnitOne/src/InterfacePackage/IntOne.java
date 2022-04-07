package InterfacePackage;

interface Intones {
	// by default public and abstract
	public abstract void ThirdMethod();

	public void FirstMethod();

	void SecondMethod();

	// by default variables are public static final
	public static final int a = 30;
	static final int b = 30;
	final int c = 40;
	int d = 50;
}
interface IntTwo extends Intones{
	void FourthMethod();
}

public class IntOne {
	public static void main(String[] args) {
		
IntOne obj = new IntOne();//can not instantiate interface
	}
}
//if class is inheriting another class extends keyword is used and implements is used for interface
class Two implements IntTwo{

	@Override
	public void ThirdMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FirstMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SecondMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FourthMethod() {
		// TODO A
	
	}

}