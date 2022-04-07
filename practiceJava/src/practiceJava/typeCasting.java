package practiceJava;

public class typeCasting {
	public static void main(String[] args) {
		//1. implicit/Automatic/widening typecasting
		int a = 34;
		double d;
		d = a;//type converted from int to double(compiler automatically
		System.out.println("integer " + a +".Double");
		//2. Narrowing/manually/Explict
		double doub = 4.5d;
		int ivar;
		ivar = (int)doub;
		System.out.println("Integer " + ivar +".Double");
		//converting or parsing String values to integer
	    String number1 = "1234";
	    String number2 = "5678";
	    System.out.println("Addition id" + number1 + number2);
	    int num1 = Integer.parseInt(number1);
	    int num2 = Integer.parseInt(number2);
	    int num3 = num1 + num2;
	    System.out.println("Addition is " + num3);
	 // how to convert integer to string
	 		num3 = Integer.String(num3);// converts integer to string
	 		System.out.println();
	
	}

}
