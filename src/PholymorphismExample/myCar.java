package PholymorphismExample;

class Car {
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;

	public Car(String name, int cylinders) {
		this.name = name;
		this.cylinders = cylinders;
		this.wheels = 4;
	}

	public String getName() {
		System.out.println(getClass().getSimpleName());
		return name;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public void startEngine() {
		System.out.println("Car engine is started!");
	}

	public void accelerate() {
		System.out.println("Car is accelerated!");
	}

	public void brake() {
		System.out.println("Car is braked!");
	}
}

class CarA extends Car {
	public CarA(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public void startEngine() {
		System.out.println("CarA engine is started!");
	}
}

class CarB extends Car {
	public CarB(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public void startEngine() {
		System.out.println("CarB engine is started!");
	}
}

class CarC extends Car {
	public CarC(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public void startEngine() {
		System.out.println("CarC engine is started!");
	}
}

class CarD extends Car {
	public CarD(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public void startEngine() {
		System.out.println("CarD engine is started!");
	}
}

public class myCar {
	public static void main(String[] args) {
		Car car = new CarA("omar", 4);
		car.startEngine();
		car = new CarB("omar", 4);
		car.startEngine();
		car = new CarD("omar", 4);
		car.startEngine();
		car = new CarC("omar", 4);
		car.startEngine();
	}
}
