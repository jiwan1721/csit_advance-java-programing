package Filehandling;

import java.io.File;


public class FileInformation {
	public static void main(String[] args) {
		File objFile = new File("Jiwan.txt");
		if (objFile.exists()) {//exits() file xa ki xaina check garxa
			System.out.println("File name: "+objFile.getName());
			System.out.println("File name: "+objFile.getAbsolutePath());
			System.out.println("File name: "+objFile.canWrite());
			System.out.println("File name: "+objFile.canRead());
			System.out.println("File name: "+objFile.length());

			
		}else {
			System.out.println("the file does not exist");
		}
	}

}
