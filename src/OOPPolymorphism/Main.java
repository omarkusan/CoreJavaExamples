package OOPPolymorphism;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer(50, true);
		System.out.println("initial page count= " + printer.getNumberOfPagesPrinted());
		int pagesPrinted = printer.printPages(4, true);
		System.out.println("Pages printed was " + pagesPrinted + " new total print acount for printer = "
				+ printer.getNumberOfPagesPrinted());
		pagesPrinted = printer.printPages(10, true);
		System.out.println("Pages printed was " + pagesPrinted + " new total print acount for printer = "
				+ printer.getNumberOfPagesPrinted());

	}
}
