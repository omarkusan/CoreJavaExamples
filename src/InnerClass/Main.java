package InnerClass;

import java.util.Scanner;

import InnerClass.Button.OnClickListener;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");
	public static void main(String[] args) {
	/*	class ClickListener implements OnClickListener{
			public ClickListener(){
				System.out.println("I've been attached ");
			}
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		}
		btnPrint.setOnClickListener(new ClickListener());
		*/
		btnPrint.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		});
		listen();
	}
	private static void listen(){
		boolean quit = false;
		while (!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				System.out.println("Exit the program.");
				break;
			case 1:
				btnPrint.onClick();
				break;
		
			}
		}
	}
}



















