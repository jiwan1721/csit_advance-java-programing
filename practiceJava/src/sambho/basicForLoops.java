package sambho;

public class basicForLoops {
	public static void main(String[] args) {
		// code of for loop
		// 0 dekhi 10 samma number print gaarna laii
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// java Nested Loop
		// if we have a loop for the another loop

		// loop of i
		for (int i = 1; i <= 3; i++) {
			// loop of j
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}

		// pyramid Example
		/*for (int i = 1; i <= 5; i++) {
			for (int j = 1; i <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}*/

		int term = 6;
		for(int i=1;i<=term;i++) {
			for(int j=term;j>=i;j--) {
				System.out.println("*");
			}
			System.out.println();
		}
		//java for-each loop
		int arr[]= {12,23,44,56,78};
		
		//for(tpe var:array)
		for(int i:arr) {
			System.out.println(i);
		}
		
		//java labeled for loop
		aa:
			for(int i=1;i<=5;i++) {
				bb:
					for(int j=1;j<=4;j++) {
						if(i==2&&j==2) {
							break bb;
							//break aa;
						}
						System.out.println(i+" "+j);
					}
			}
		
		
		//java progam to demonstrate the use of infinite for loop
		/*for(;;) {//using no condition infor loop
			System.out.println("dherai loop");
		}*/
}
}