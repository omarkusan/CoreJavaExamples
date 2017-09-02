package InterfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Player omar = new Player("Omar", 50, 100);
		System.out.println(omar.toString());
		saveObject(omar);
		omar.setHitPoints(0);
		System.out.println(omar.toString());
		omar.setWeapon("Gun");
		saveObject(omar);
		loadObject(omar);
		System.out.println(omar);
		
		ISaveable werewolf = new Monster("Werewolf", 20, 40);
		System.out.println(werewolf);
	}
	public static ArrayList<String> readValues(){
		ArrayList<String> values = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n");
		System.out.println("1 to enter a string\n");
		System.out.println("0 to quit");
		while (!quit) {
			System.out.println("Choose an option");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				System.out.println("Enter a string:");
				String stringInput = scanner.nextLine();
				values.add(index,stringInput);
				index++;
				break;

			default:
				break;
			}
		}
		return values;
	}
	public static void saveObject(ISaveable objectTosave){
		for (int i = 0; i < objectTosave.write().size(); i++) {
			System.out.println("Saving " + objectTosave.write().get(i) + " to storage device");
		}
	}
	public static void loadObject(ISaveable objectToLoad){
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}
}
