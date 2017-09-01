package AutoboxingAndUnboxingChallenge;

public class Main {
	public static void main(String[] args) {
		System.out.println("Omar");
		Bank bank = new Bank("National Australia Bank");
		bank.addBranch("Adelaide");
		bank.addCustomer("Adelaide", "Omar", 100.05);
		bank.addCustomer("Adelaide", "Bob", 75.05);
		bank.addCustomer("Adelaide", "Alim", 220.12);
		bank.addBranch("Sydney");
		bank.addCustomerTransaction("Sydney", "Bob", 150.54);
		
		bank.addCustomerTransaction("Adelaide", "Omar", 100.02);
		bank.addCustomerTransaction("Adelaide", "Omar", 12.02);
		bank.addCustomerTransaction("Adelaide", "Omar", 45.60);
		
		bank.listCustomer("Adelaide", false);
		
		
		
		
		
		
		
		
		
	}
}
