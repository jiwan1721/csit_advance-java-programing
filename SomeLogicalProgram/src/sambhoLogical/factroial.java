package sambhoLogical;

import java.util.Scanner;

public class factroial {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = inp.nextInt();
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}

		System.out.println("Factroial of " + num + " is " + fact);

	}
}
