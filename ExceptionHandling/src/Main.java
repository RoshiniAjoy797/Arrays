
public class Main {
	public static void main(String[] args) {

		ATM atm = new ATM();

		// Test cases
		atm.withdraw(50); // Successful transaction
		atm.withdraw(-10); // Error: Amount must be greater than zero.
		atm.withdraw(7); // Error: Amount must be a multiple of 10.
		atm.withdraw(2000); // Error: ATM does not have enough cash.
		atm.withdraw(1000); // Successful transaction
	}
} 