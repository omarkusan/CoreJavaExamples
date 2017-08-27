package ClassesComposition;

public class Case {
	private String model;
	private String manufaturer;
	private String powerSupply;
	private Dimensions dimensionns;

	public Case(String model, String manufaturer, String powerSupply, Dimensions dimensionns) {
		this.model = model;
		this.manufaturer = manufaturer;
		this.powerSupply = powerSupply;
		this.dimensionns = dimensionns;
	}

	public void pressPowerButton() {
		System.out.println("Power button is pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufaturer() {
		return manufaturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimensionns() {
		return dimensionns;
	}

}
