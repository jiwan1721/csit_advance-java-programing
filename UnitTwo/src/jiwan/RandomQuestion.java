package jiwan;

import java.util.Random;
import java.util.Scanner;

public class RandomQuestion {
	static void rand() {
		int incorrectAns = 0;
		int correctAns = 0;
		int totalMarks = 0;
		int[] a = {};
		int[] b = {};
		int[] c = {};
		int result = 0;

		for (int i = 0; i <= 2; i++) {

			Random objs = new Random();
			int randomNumber = objs.nextInt(100);
			int randomNumber1 = objs.nextInt(100);

			System.out.println("what the total of " + randomNumber + " + " + randomNumber1);
			result = randomNumber + randomNumber1;

			Scanner myObj = new Scanner(System.in);
			System.out.println("Ans: ");
			int num = myObj.nextInt();
			if (result == num) {
				correctAns += 1;
				totalMarks += 10;
			} else {
				incorrectAns += 1;
				totalMarks -= 5;
			}
			a[i] = randomNumber;
			b[i] = randomNumber1;
			c[i] = result;

		}
		System.out.println("total correct ans = " + correctAns);
		System.out.println("total incorrect ans = " + incorrectAns);
		System.out.println("total marks = " + totalMarks);
		System.out.println("correct answer");

	}

	public static void main(String[] args) {

		rand();

	}
}
