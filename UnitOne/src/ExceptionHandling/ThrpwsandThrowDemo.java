package ExceptionHandling;


public class ThrpwsandThrowDemo {
	public static void doCheck() throws Exception{
		System.out.println("i m inside method");
		// throw keyword provides exception to the next block
		throw new ArithmeticException("Arithemetic Exception Demonstratiom");
		//description of an exception is inside the quotes
	}
	public static void main(String[] args) {
		try {
			doCheck();
		}
		catch (Exception ex) {
			System.err.println("Exception caught is: " +ex);
		}
	}

}
