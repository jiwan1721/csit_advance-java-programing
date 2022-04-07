package sambho;



public class IfElseStatement {
	public static void main(String[] args) {
		
		//defining age as variable
		int age=20;
		
		//checking the age using if statement
		if(age>18) {
			System.out.println("age is greater than 18");
			
		}
		
		//java if-else statement
		//it is a program of odd and even number
		
		//defining a variable 
		int number = 13;
		
		//check if the number is divisible by 2 or not
		if(number%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		
		//leap Year Example
		
		//year is a variable
		int year = 2020;
		
		//check if year is leap or not
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Common Year");
		}
		
		//Using ternary Operator
		int numbs=13;
		//using tenary operator
		String outputString =(numbs%2==0)?"even number":"odd number";
		System.out.println(outputString);
		
		//Java if-else-if ladder Statement
		int marks=80;
		
		if(marks<50) {
			System.out.println("fail");
		}
		else if(marks>=50&&marks<60) {
			System.out.println("D grade");
		}
		else if(marks>=60&&marks<70) {
			System.out.println("C grade");
		}
		else if(marks>=70&&marks<80) {
			System.out.println("B grade");
		}
		else if(marks>=80&&marks<90) {
			System.out.println("A grade");
		}
		else if(marks>=90&&marks<100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
