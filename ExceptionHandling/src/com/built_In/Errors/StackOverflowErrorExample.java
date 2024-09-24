package com.built_In.Errors;

public class StackOverflowErrorExample {
	
	public static void recurseForever() {
		recurseForever();
	}

	public static void main(String[] args) {
		//Uncontrolled recusrion
		recurseForever();
	}

}
