package LinkedList;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("Omar", 55.99);
		Customer anotherCustomer;
		anotherCustomer = customer;
		anotherCustomer.setBalance(100.99);
		System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(3);
		intList.add(4);
		for(int i = 0; i < intList.size(); i++){
			System.out.println(i + ": " + intList.get(i));
		}
		intList.add(1, 2);
		for(int i = 0; i < intList.size(); i++){
			System.out.println(i + ": " + intList.get(i));
		}
		
	}
}
