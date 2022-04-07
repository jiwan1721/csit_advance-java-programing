package sambhoLogical;

import java.util.Scanner;

public class swapNumber {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int i = num.nextInt();
		System.out.println("Enter 2nd number: ");
		int j = num.nextInt();
		
		System.out.println("before swap value of i is: "+i+" and value of j: "+j);
		
		i = i + j;
		j = i - j;
		i = i -j;
		System.out.println("after swap value of i is: "+i+" value of j"+j);
	}

}
