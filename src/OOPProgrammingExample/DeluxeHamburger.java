package OOPProgrammingExample;

public class DeluxeHamburger extends Hamburger {
	private Chips chips;
	private Drinks drinks;

	public DeluxeHamburger(double price, String rollType, Meat meat, Chips chips, Drinks drinks) {
		super(price, rollType, meat);
		this.chips = chips;
		this.drinks = drinks;
	}

	public Chips getChips() {
		return chips;
	}

	public Drinks getDrinks() {
		return drinks;
	}

	@Override
	public void basePrice() {
		System.out.println("Base price: " + super.getPrice());
		System.out.println("Additionals:");
		double additionalPrice = 0;
		if (super.getMeat() != null) {
			System.out.println("Meat");
			additionalPrice += super.getMeat().getPrice();
		}
		if (super.getLettuce() != null) {
			System.out.println("Lettuce");
			additionalPrice += super.getLettuce().getPrice();
		}
		if (super.getTomato() != null) {
			System.out.println("Tomato");
			additionalPrice += super.getTomato().getPrice();
		}
		if (super.getCarrot() != null) {
			System.out.println("Carrot");
			additionalPrice += super.getCarrot().getPrice();
		}
		if (chips != null) {
			System.out.println("Chips");
			additionalPrice += chips.getPrice();
		}
		if (drinks != null) {
			System.out.println("Drinks");
			additionalPrice += drinks.getPrice();
		}
		System.out.println("Total price: " + (additionalPrice + super.getPrice()));
	}

}
