package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ReadAfile{
	private Scanner input;
	void openFile() throws FileNotFoundException {
		input =new Scanner(new File("F:\\sambho.txt"));
	}
	void readFile() {
		while(input.hasNext()) {// if there contains
			String a = input.nextLine();
			String b = input.nextLine();
			String c = input.nextLine();
			String d = input.nextLine();
			int e = input.nextInt();
			System.out.println(a);// concatenation
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			
		}
	}
	void closeFile() {
		input.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		ReadAfile rf = new ReadAfile();
		rf.openFile();
		rf.readFile();
		rf.closeFile();

	}
}
