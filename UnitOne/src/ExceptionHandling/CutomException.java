package ExceptionHandling;
class OwnException extends Exception{
	public OwnException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
public class CutomException {
	public static void StudentAge(int age) throws OwnException {
		if(age<0) {
			throw new OwnException("Age can not be less than zero!");
			
		}else {
			System.out.println("valid Input");
		}
	}
	public static void main(String[] args) {
		try {
			StudentAge(-14);
		} catch (OwnException ex) {
			System.err.println("Exception is: "+ex);
		}
	}

}
