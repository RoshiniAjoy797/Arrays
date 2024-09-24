package com.built_In.CheckedException;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EOFExceptionExample {
	/*
	 * EOFException (End of File Exception). a try-with-resources statement,
	 * introduced in Java 7 to ensure that resources (like files, streams, or
	 * sockets) are automatically closed after they are no longer needed, which
	 * helps prevent resource leaks.
	 * 
	 * When the try block finishes executing, whether normally or due to an
	 * exception, the close() method of the resource is automatically called. This
	 * ensures that the resource is properly closed, even if an exception is thrown
	 * within the try block.
	 * 
	 */
	public static void main(String[] args) {
		// C:/Users/A. ROSHINI/Desktop/Xybion Login Details New.txt
		try (DataInputStream dis = new DataInputStream(
				new FileInputStream("C:/Users/A. ROSHINI/Desktop/Xybion Login Details New.txt"))) {
			while (true) {
				int number = dis.readInt();
				System.out.println("Read byte: " + number);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found : " + e.getMessage());
		} catch (EOFException e) {
			e.printStackTrace();
			System.out.println("End of file reached : " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * Without Try-with-Resources : need to manually close the resource in a finally
		 * block to ensure that it is closed even if an exception occurs
		 * 
		 */

		DataInputStream d = null;
		try {
			d = new DataInputStream(new FileInputStream("C:/Users/A. ROSHINI/Desktop/Xybion Login Details New.txt"));
			int value = d.readInt(); // Reads 4 bytes and converts to an int
            System.out.println("Read int: " + value);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (d != null) {
				try {
					d.close();
					System.out.println("Resource closed explicitly");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
