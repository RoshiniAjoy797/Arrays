
public class throw_Example {
	public static void validateAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		}
		System.out.println("Age is valid");
	}

	public static void main(String[] args) {
		// Throwing a Built-in Exception
		try {
			validateAge(15);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception is : " + e.getMessage());
		}
	}

}
