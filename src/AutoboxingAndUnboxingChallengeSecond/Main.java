package AutoboxingAndUnboxingChallengeSecond;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank("National Austrlia Bank");
		bank.addBranch("Adelaide");
		bank.addCustomer("Adelaide", "Omar", 100.50);
		bank.addCustomer("Adelaide", "Alim", 50.50);
		bank.addCustomer("Adelaide", "Bob", 25.50);
		
		bank.addBranch("Sydney");
		bank.addCustomer("Sydney", "Omar", 100.50);
		bank.addCustomer("Sydney", "Alim", 50.50);
		bank.addCustomer("Sydney", "Bob", 25.50);
		bank.addCutomerTransaction("Adelaide", "Omar", 213);
		bank.addCutomerTransaction("Adelaide", "Omar", 123);
		bank.addCutomerTransaction("Adelaide", "Omar", 1000);
		bank.listCustomers("Adelaide", true);
		
	}
}
