package AutoboxingAndUnboxingChallengeSecond;

import java.util.ArrayList;

/**
 * @author Omar
 *
 */
public class Bank {
	private String name;
	private ArrayList<Branch> branchs;

	public Bank(String name) {
		this.name = name;
		this.branchs = new ArrayList<>();
	}
	
	public boolean addBranch(String branchName){
		if(findBranch(branchName) == null){
			this.branchs.add(new Branch(branchName));
			return true;
		}
		return false;
	}
	public boolean addCustomer(String branchName,String customerName, double initalAmount){
		Branch branch = findBranch(branchName);
		if(branch != null){
			return branch.newCustomer(customerName, initalAmount);
		}
		return false;
	}
	public boolean addCutomerTransaction(String branchName,String customerName,double amount){
		Branch branch = findBranch(branchName);
		if(branch != null){
			return branch.addCustomerTransaction(customerName, amount);
		}
		return false;
	}
	public Branch findBranch(String branchName){
		for (int i = 0; i < this.branchs.size(); i++) {
			Branch checkedBranch = this.branchs.get(i);
			if(checkedBranch.getName().equals(branchName)){
				return checkedBranch;
			}
		}
		return null;
	}
	public boolean listCustomers(String branchName, boolean showTransactions){
		Branch branch = findBranch(branchName);
		if(branch != null){
			System.out.println("Customer details for branch " + branch.getName());
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for(int i = 0; i < branchCustomers.size(); i++){
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");
				if(showTransactions){
					System.out.println("Transactions:");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for(int j = 0; j < transactions.size(); j++){
						System.out.println("[" + (j + 1 ) + "] Amount " + transactions.get(j));
					}
				}
			}
			return true;
		}else {
			return false;
		}
	}

}


















