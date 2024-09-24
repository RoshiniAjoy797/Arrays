public class ATM {
	private double accBalance = 1000.0;
	private double atmCash = 5000.0;

	// Method to withdraw money
	public void withdraw(double amount) {
		try {
			if (amount <= 0) {
				throw new IllegalArgumentException("Amount must be greater than zero.");
			}

			if (amount % 10 != 0) {
				throw new IllegalArgumentException("Amount must be a multiple of 10.");
			}

			if (amount > accBalance) {
				throw new InsufficientFundsException("Insufficient funds in account.");
			}

			if (amount > atmCash) {
				throw new ATMOutOfCashException("ATM does not have enough cash.");
			}

			// Process the withdrawal
			accBalance -= amount;
			atmCash -= amount;
			System.out.println("Withdrawal successful. Amount: " + amount);
			System.out.println("Remaining balance: " + accBalance);
			System.out.println("Remaining ATM cash: " + atmCash);

		} catch (IllegalArgumentException | InsufficientFundsException | ATMOutOfCashException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			// Any cleanup code can go here, if needed
			System.out.println("Transaction completed.");
		}
	}

	public static class ATMOutOfCashException extends Exception {
		public ATMOutOfCashException(String message) {
			super(message);
		}

	}

	public static class InsufficientFundsException extends Exception {
		public InsufficientFundsException(String message) {
			super(message);
		}
	}

}
