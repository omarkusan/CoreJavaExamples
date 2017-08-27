package ControlFlowStatements;

public class Switch {
	public static void main(String[] args) {

		for (int i = 8; i >= 2; i--) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
		}
		int numberOfPrimeNumber = 0;
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is a prime number");
				numberOfPrimeNumber++;
				if (numberOfPrimeNumber == 3) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= (long) Math.sqrt(n); i++) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}

}
