package Classes;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String emailAddress;

	public VipCustomer() {
		this("Omar", 1500, "Fairfield, IA");
	}

	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "Fairfield");
	}

	public VipCustomer(String name, double creditLimit, String address) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = address;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

}
