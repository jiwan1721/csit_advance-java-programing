package sambhoLogical;

import java.io.Closeable;
import java.util.Scanner;



public class UserBubble {
	
	public static void main(String[] args) {
		Scanner ingar = new Scanner(System.in);
		System.out.println("Enter the list of array : ");
		
		int n = ingar.nextInt();
		
		System.out.println("Enter numbers :");
		int[] a = new int[n];
		
	
		int temp = 0;
		for(int i = 0; i<n; ++i) {
			a[i] = ingar.nextInt();
		}
		System.out.println("the array elements are: ");
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]+ " ");
		}
		for(int i = 0; i<a.length-1; i++) {
			for(int j = 0; j<a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("The sorted elementts are: ");
		for(int i = 0; i <n; i++) {
			System.out.println(a[i]+"");
		}
		ingar.close();
		
	}


}
