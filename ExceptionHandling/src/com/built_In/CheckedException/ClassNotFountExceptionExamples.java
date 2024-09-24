package com.built_In.CheckedException;

public class ClassNotFountExceptionExamples {
	/*
	 * ClassNotFoundException is a checked exception. (JRE) cannot find the
	 * specified class in its class path during runtime.
	 * 
	 * NoClassDefFoundError, which occurs when the class was available during
	 * compile-time but not at runtime.
	 * 
	 */
	public static void main(String[] args) {
		
		// Using Class.forName
		try {
			Class<?> loadedClass = Class.forName("com.built_In.CheckedException.EOFExceptionExample");
            System.out.println("Class loaded successfully: " + loadedClass.getName());
			
//			Class.forName("com.built_In.CheckedExcepti.EOFExceptionExample");
//			ClassLoader.getSystemClassLoader().loadClass("com.built_In.CheckedExcepti.EOFExceptionExample");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
