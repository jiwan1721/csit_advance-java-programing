package Filehandling;

import java.io.File; //Import the File Class
import java.io.FileWriter; //Import the FileWriter class
import java.io.IOException;//Import IOException class

public class filejava {
	public static void main(String[] args) {
		try {
		//File myobj = new File("jiwan.txt");//file crate garney
		//if (myobj.createNewFile()) {
		//	System.out.println("File created: "+myobj.getName());
		//}
			FileWriter myobj = new FileWriter("F:\\7th sem java\\UnitOne\\src\\Filehandling\\Jiwan.txt");
		   myobj.write("Write file ley file vittra lekhna help garxa");
		   myobj.close();
		   System.out.println("Sucessfully wrote to the file");
		}
		catch(

	IOException e)
	{
		System.out.println("An error occured.");
		e.printStackTrace(); //exception and error handle garxa
	}
}

}
