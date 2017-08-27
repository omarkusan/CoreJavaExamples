package OOPProgrammingExample;

public class Hamburger {
	private double price;
	private String rollType;
	private Meat meat;
	private Lettuce lettuce;
	private Tomato tomato;
	private Carrot carrot;

	public Hamburger(double price, String rollType, Meat meat) {
		this.price = price;
		this.rollType = rollType;
		this.meat = meat;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRollType() {
		return rollType;
	}

	public void setRollType(String rollType) {
		this.rollType = rollType;
	}

	public Meat getMeat() {
		return meat;
	}

	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public Lettuce getLettuce() {
		return lettuce;
	}

	public void setLettuce(Lettuce lettuce) {
		this.lettuce = lettuce;
	}

	public Tomato getTomato() {
		return tomato;
	}

	public void setTomato(Tomato tomato) {
		this.tomato = tomato;
	}

	public Carrot getCarrot() {
		return carrot;
	}

	public void setCarrot(Carrot carrot) {
		this.carrot = carrot;
	}

	public void basePrice() {
		System.out.println("Base price: " + this.price);
		System.out.println("Additionals:");
		double additionalPrice = 0;
		if (meat != null) {
			System.out.println("Meat price: " + meat.getPrice());
			additionalPrice += meat.getPrice();
		}
		if (lettuce != null) {
			System.out.println("Lettuce price: " + lettuce.getPrice());
			additionalPrice += lettuce.getPrice();
		}
		if (tomato != null) {
			System.out.println("Tomato price: " + tomato.getPrice());
			additionalPrice += tomato.getPrice();
		}
		if (carrot != null) {
			System.out.println("Carrot price: " + carrot.getPrice());
			additionalPrice += carrot.getPrice();
		}
		System.out.println("Total price: " + (this.price + additionalPrice));

	}

}
