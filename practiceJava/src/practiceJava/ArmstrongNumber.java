package practiceJava;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int a = number, r = 0, result = 0;
		while(a!=0) {
			r = a%10;
			a = a/10;
			result = result + r*r*r;
		}
		if(result==number) {
			System.out.println(number+" is an amrstrong.");
		}
		else {
			System.out.println(number+" is not an armstrong number");
		}

	}

}
