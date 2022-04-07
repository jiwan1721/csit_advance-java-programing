package ExceptionHandling;

import java.util.Scanner;



public class NoexceptionHandlerUsed {
	public static int Quotient(int numerator, int denominator) {
		return numerator / denominator;
	}
	public static void main(String[] args) {
		int num, denomin;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numerator ");
		num = input.nextInt();
		System.out.println("Enter Denomet0r ");
		denomin = input.nextInt();
		int division = Quotient(num, denomin);
		System.out.println("the division result is" + division);
		input.close();
	}

}
