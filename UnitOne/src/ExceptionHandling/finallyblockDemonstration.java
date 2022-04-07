package ExceptionHandling;

import java.util.Scanner;

public class finallyblockDemonstration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			throw new ArithmeticException("Finally always executes");
			
		}
		catch(Exception ex) {
			System.out.println("Exception is: " +ex);
			
		}
		finally {
			input.close(); //memory resource free
			//it is used to free resource eg any opened file,socket, database connection.
			//break, continue and return statements never stops execution of finally block
			//finally will not execute if we are using system.exit(0)
			System.out.println("i always execute");
			
		}
	}

}
