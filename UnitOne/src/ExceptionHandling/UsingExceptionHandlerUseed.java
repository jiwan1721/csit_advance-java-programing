package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingExceptionHandlerUseed {

	public static int Quotient(int numerator, int denominator) {
		return numerator / denominator;
	}

	public static void main(String[] args) {
		int num, denomin;
		boolean continueloop = true;
		Scanner input = new Scanner(System.in);
		do {
			try {

				System.out.println("Enter numerator: ");
				num = input.nextInt();
				System.out.println("Enter Denomet0r: ");
				denomin = input.nextInt();
				int division = Quotient(num, denomin);
				System.out.println("the division result is: " + division);
				continueloop = false;

			} catch (InputMismatchException ex) {
				System.err.println("Exception is" + ex);
			} catch (ArithmeticException ex) {
				System.err.println("Exception is : " + ex);
				System.out.println("Must enter non zero integer. try again..");
			}
		} while (continueloop);
	}
}
