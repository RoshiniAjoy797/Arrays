package throws_Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
	public static void readFile(String fileName)
			throws FileNotFoundException {
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		{
			String line;
			// Read each line and print it to the console
			try {
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("File read successfully!");
	}

	public static void main(String[] args) {
		try {
			readFile("C:/Users/A. ROSHINI/Desktop/"
					+ "Xybion Login Details New.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Caught exception : " + e.getMessage());
		}
	}
}
