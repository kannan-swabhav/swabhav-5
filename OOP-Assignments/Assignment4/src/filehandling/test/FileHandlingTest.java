package filehandling.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingTest {
	public static void main(String args[]) throws IOException {
		int count = 0;
		File file = createFile("file.txt");
		count = writeToFile(file, "hello",count);
		readFromfile(file.getAbsolutePath());

		System.out.println();
		count = writeToFile(file, "hello2",count);
		readFromfile(file.getAbsolutePath());
		
		System.out.println();
		count = writeToFile(file, "hello3",count);
		readFromfile(file.getAbsolutePath());
		
		

	}

	public static File createFile(String filename) {
		File file = new File(filename);
		System.out.println("new file created " + file.getName());
		return file;
	}

	public static int writeToFile(File file, String txt,int count) throws IOException  {

		FileWriter fr = new FileWriter(file, true);
		if(count == 0) {
		fr.write(txt);
		count++;
		}
		else {
			fr.write(" " +txt);
		}
		fr.close();
		return count;
		

	}

	public static void readFromfile(String absolutepath) throws IOException {
		FileReader fr = new FileReader(absolutepath);

		int end;
		while ((end = fr.read()) != -1)
			System.out.print((char) end);

	}
}
