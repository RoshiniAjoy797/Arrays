import java.util.Scanner;

public class LambdaExpressionDemo {
	/*
	 * you can throw exceptions inside a lambda expression's body. However, if the
	 * exception is a checked exception, the functional interface method that the
	 * lambda expression implements must declare that it throws the exception.
	 * 
	 */
	public static void main(String[] args) {
		ThrowingConsumer<Integer> consumer = (Integer i) -> {
			if (i < 0) {
				throw new Exception("Negative value not allowed");
			}
			System.out.println(i);
		};

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int i = sc.nextInt();

		try {
			consumer.accept(i);
		} catch (Exception e) {
			System.out.println("Exception caught : " + e.getMessage());
			e.printStackTrace();
		}
	}
}
