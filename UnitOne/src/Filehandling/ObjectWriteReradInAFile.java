package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import concurrncy.newSyn;



class student implements Serializable{ //To convert object Stream in byte
	private String name;
	private int age;
	private String genderString;
	public student(int age,String name, String gender) {
		this.name = name;
		this.age = age;
		this.genderString = gender;
	}
	public String toString() {
		return "Name:"+name+", Age:"+age+",Gender:";
	}
	
}
public class ObjectWriteReradInAFile {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		student st1 = new student(45, "jiwan", "Male");
		student st2 = new student(47, "ram", "Male");
		File file = new File("F:\\sambho.txt");
		//writing objects in file
		FileOutputStream fOutputStream = new FileOutputStream(file);
		ObjectOutputStream obje = new ObjectOutputStream(fOutputStream);
		
		obje.writeObject(st1);
		obje.writeObject(st2);
		System.out.println("objects written into a file source");
		obje.close();
		fOutputStream.close();
		
		
		//Reading byte data (object data) from a file and convert into object
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream oi = new ObjectInputStream(fi);
// Reading objects
		student s1 = (student) oi.readObject();// converting byte stream to object
		student s2 = (student) oi.readObject();// converting byte stream to object
		// reading on console
		System.out.println("Student one data: " + s1.toString());
		System.out.println("Student one data: " + s2.toString());
		oi.close();
		fi.close();
	}

}
