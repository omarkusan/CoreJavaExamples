package Classes;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public BankAccount() {
		this("12345", 100, "omar", "omar@gmail.com", "515-735-0031");
		System.out.println("Empty constructor called");
	}

	public BankAccount(String customerName, String email, String phoneNumber) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Account constructor with parameters called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void depositFunds(double funds) {
		if (funds >= 0) {
			this.balance += funds;
			System.out.println("Your deposit amount is: " + funds);
			System.out.println("Your balance is: " + this.balance);
		} else {
			System.out.println("Invalid deposit!");
		}
	}

	public void withdrawFunds(double funds) {
		if (funds >= 0 && this.balance >= funds) {
			this.balance -= funds;
			System.out.println("Your withdraw amount is: " + funds);
			System.out.println("Your balance is: " + this.balance);
		} else {
			System.out.println("Invalid withdraw!");
		}
	}

}
