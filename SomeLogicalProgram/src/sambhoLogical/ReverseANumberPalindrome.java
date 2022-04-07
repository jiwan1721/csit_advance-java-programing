package sambhoLogical;

import java.util.Scanner;

public class ReverseANumberPalindrome {
	static int checkpalindrome(int num) {
	int newN = 0, rem, temp;
	temp=num;

	while(temp != 0) {
	rem = temp%10;
	newN = newN*10+rem;
	temp = temp/10;
}
if(newN == num) {
	System.out.println(num+ " is palindrome");
}
else {
	System.out.println(num+" is not palindrome");

}
return newN;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = input.nextInt();
		int n = checkpalindrome(no);
		System.out.println("Reverse of a string " +n);
	}
}
