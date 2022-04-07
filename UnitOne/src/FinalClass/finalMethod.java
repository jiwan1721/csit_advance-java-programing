package FinalClass;

class Base {
	int number = 47;
	void getnumber() {
		System.out.println("Number is :" + number);
	}
}

public class finalMethod extends Base{//base is inherited
	//final methods can be inherited but can not be overridden
	@Override
	//getnumber is  inherited bbut not overridden
	void getnumber() {
		System.out.println("i m overridden");
	}
	public static void main(String[] args) {
		finalMethod objFinalMethod = new finalMethod();
		objFinalMethod.getnumber();
	}

}
