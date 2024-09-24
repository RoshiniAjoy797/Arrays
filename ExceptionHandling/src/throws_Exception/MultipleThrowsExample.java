package throws_Exception;

import java.io.*;

public class MultipleThrowsExample {
	public static void readFile(String fileName) throws FileNotFoundException, IOException {
		File file = new File(fileName);
		// Using try-with-resources for automatic resource management
		try (FileReader fr = new FileReader(file); 
		BufferedReader br = new BufferedReader(fr)) {
			String line;
			// Read each line and print it to the console
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} // No need for a catch block here; IOException is handled in main

		System.out.println("File successfully read!");
	}

	public static void main(String[] args) {
		try {
			readFile("C:/Users/A. ROSHINI/Desktop" + "/Xybion Login Details New.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Caught file not found exception" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Caught IOException" + e.getMessage());
			e.printStackTrace();
		}
	}
}
