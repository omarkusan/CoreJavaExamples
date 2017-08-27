package OOPProgrammingExample;

public class Main {
	public static void main(String[] args) {
		// Hamburger hamburger = new Hamburger(10,"abc", new Meat(4));
		// hamburger.basePrice();
		// hamburger.setLettuce(new Lettuce(5));
		// hamburger.setTomato(new Tomato(1));
		// hamburger.setCarrot(new Carrot(1));
		// hamburger.basePrice();
		HealthyBurger healthyBurger = new HealthyBurger(10, new Meat(5));
		healthyBurger.setCarrot(new Carrot(1));
		healthyBurger.setItem1(new Item1(2));
		healthyBurger.basePrice();
		DeluxeHamburger deluxeHamburger = new DeluxeHamburger(10, "Omar", new Meat(2), new Chips(1), new Drinks(4));
		deluxeHamburger.setCarrot(new Carrot(1));
		deluxeHamburger.basePrice();

	}
}
