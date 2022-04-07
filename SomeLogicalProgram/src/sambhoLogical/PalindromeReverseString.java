package sambhoLogical;

import java.util.Scanner;

public class PalindromeReverseString {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = inputScanner.next();
		String resultString = "";
		for(int i = string.length()-1; i>=0; i--) {
			resultString = resultString+string.charAt(i);
		}
		System.out.println("Reverse of "+string+" is "+resultString);
		if(resultString.equals(string)) {
			System.out.println(string+" is plindrone.");
		}
		else {
			System.out.println(string+" is not palindrome");
		}
		

	}
	

}
