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
		count = writeToFile(file, "hello", count);
		readFromfile(file);

		System.out.println();
		count = writeToFile(file, "hello2", count);
		readFromfile(file);

		System.out.println();
		count = writeToFile(file, "hello3", count);
		readFromfile(file);

		
	}

	public static File createFile(String filename) {

		File newfile = new File(filename);
		System.out.println("new file created" + newfile.getName());
		return newfile;
		
	}

	public static int writeToFile(File file, String txt, int count) throws IOException {

		FileWriter fr = new FileWriter(file, true);
		if (count == 0) {
			fr.write(txt);
			count++;
		} else {
			fr.write(" " + txt);
		}
		fr.close();
		return count;

	}

	public static void readFromfile(File file) throws IOException {
		FileReader fr = new FileReader(file);

		int end;
		while ((end = fr.read()) != -1)
			System.out.print((char) end);

	}
}
