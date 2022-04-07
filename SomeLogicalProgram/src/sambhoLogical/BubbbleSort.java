package sambhoLogical;

public class BubbbleSort {
	static void bubblesorting(int[] a) {
		int n = a.length;
		int temp = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n - 1); j++) {
				if(a[j-1]>a[j]) {
					//Swap elements
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[] = {2,33,43,54,3,12,23,14};
		
		System.out.println("Before bubble sort");
		for(int i = 0; i <a.length; i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		bubblesorting(a); // yesley chai bublesorting constructor laii call garxa
		System.out.println("after bubblesort");
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

}
