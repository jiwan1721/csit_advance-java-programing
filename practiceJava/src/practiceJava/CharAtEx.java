package practiceJava;

import java.util.Scanner;

public class CharAtEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sentence");
		String str = input.nextLine();
		System.out.println("Enter a letter");
		String a = input.next();
		int count = 0;
		for(int i = 0; i<=str.length()-1;++i) {
					if(str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("Frequency of "+a+" is "+count);
	}

}
