package Filehandling;

import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("f:\\sambho.txt", "rw");
		file.writeChars("kathmandu");
		file.writeInt(27);
		file.writeDouble(24563.466);
		file.writeBoolean(false);
		file.seek(0);
		
		System.out.println(file.readChar());
		System.out.println(file.readInt());
		System.out.println(file.readDouble());
		System.out.println(file.readBoolean());
		file.seek(4);
		file.seek(file.length());
		file.writeBoolean(false);
		file.seek(file.length()-1);
		System.out.println();
		file.close();
	}	
	

}
