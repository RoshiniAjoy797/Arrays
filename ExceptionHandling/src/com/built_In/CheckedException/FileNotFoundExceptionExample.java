package com.built_In.CheckedException;

import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionExample {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:/Users/A. ROSHINI/Desktop/Xybion Login Details New.txt");
			int character;
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			 System.out.println("I/O error occurred: " + e.getMessage());
		}
	}
}
