package Filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ReadFiles {
	public static void main(String[] args) {
		try {
		File newfile = new File("Jiwan.txt");
		Scanner fileRd = new Scanner(newfile);
		while (fileRd.hasNextLine()) {
			String dataString = fileRd.nextLine();
			System.out.println(dataString);
		}
		fileRd.close();
		}catch (IOException e) {
			System.out.println("An Error occured");
			e.printStackTrace();
		}
	}

}
