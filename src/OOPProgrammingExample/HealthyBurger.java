package OOPProgrammingExample;

public class HealthyBurger extends Hamburger {
	private Item1 item1;
	private Item2 item2;

	public HealthyBurger(double price, Meat meat) {
		super(price, "brown rye bread roll", meat);
	}

	public Item1 getItem1() {
		return item1;
	}

	public void setItem1(Item1 item1) {
		this.item1 = item1;
	}

	public Item2 getItem2() {
		return item2;
	}

	public void setItem2(Item2 item2) {
		this.item2 = item2;
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
		if (item1 != null) {
			System.out.println("Item 1");
			additionalPrice += item1.getPrice();
		}
		if (item2 != null) {
			System.out.println("Item 2");
			additionalPrice += item2.getPrice();
		}
		System.out.println("Total price: " + (additionalPrice + super.getPrice()));

	}

}
