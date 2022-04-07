package ExceptionHandling;

import java.util.Scanner;

public class sirlepathakofinally {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			throw new ArithmeticException("Finally always executes");
		} catch (Exception ex) {
			System.out.println("Exception is: " + ex);
			//System.exit(0);// whole program stops its execution
		} finally {
			input.close();// memory resource free
			System.out.println("I always execute");
			// it is used to f
//free resources e.g. any opened file, socket, database
			// connection.
			// break, continue and return statements never stops execution of finally block
			// finally will not execute if we are using System.exit(0);
		}
	}

}
