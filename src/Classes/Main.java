package Classes;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.depositFunds(100.0);
		account.withdrawFunds(45.45);
		account.withdrawFunds(100);
		account.depositFunds(1);
	}

}
