package ArrayListChallenge;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("123 456 7897");

	public static void main(String[] args) {
		boolean quit = false;
		startPhone();
		printActions();
		while (!quit) {
			System.out.println("\nEnter action: (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("\nShutting down...");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
			case 2:
				addNewContact();
				break;
			case 3:
				updateConntact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			default:
				break;
			}
		}
	}
	private static void addNewContact(){
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phoneNumber = scanner.nextLine();
		Contact contact = Contact.createContact(name, phoneNumber);
		
	}
	public static void startPhone() {
		System.out.println("Starting phone...");
	}
	private static void printActions() {
		System.out.println("\nAvailable actions:\npress");
		System.out.println("0 - to shutdown\n" + "1 - to print contacts\n" + 
							"2 - to add a new contact\n" +"3 - to update existing contact\n" +
							"3 - to remove an exsitign contact\n"+
							"5 - to query if an existing contact exists\n" + 
							"6 - to print a list of available actions.");
		System.out.println("Choose your actions: ");
	}
	
}