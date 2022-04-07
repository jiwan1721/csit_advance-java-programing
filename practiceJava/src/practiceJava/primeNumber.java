package practiceJava;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int i = 2;
		for(; i<10; i++) {
			if(num%i==0 && num!=i) {
				System.out.println(num+" is not a prime number");
				break;
			}
		}
		if(i==10) {
			System.out.println(num+" is a prime number");
		}
	}

}
