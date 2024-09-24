package throws_Exception;

import java.util.Scanner;

public class CustomExceptionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();

		try {
			validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println("Exception caught : " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
		System.out.println("Age is valid..");
	}
}
