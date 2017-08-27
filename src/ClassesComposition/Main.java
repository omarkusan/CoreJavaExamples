package ClassesComposition;

import ClassesCompositionChallenge.Bed;
import ClassesCompositionChallenge.Bedroom;
import ClassesCompositionChallenge.Ceiling;
import ClassesCompositionChallenge.Lamp;
import ClassesCompositionChallenge.Wall;

public class Main {
	public static void main(String[] args) {
		Case theCase = new Case("202B", "Dell", "240", new Dimensions(20, 20, 5));
		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
		Motherboard tMotherboard = new Motherboard("BJ-200", "Asus", 4, "v2.44");

		PC thePc = new PC(theCase, theMonitor, tMotherboard);
		thePc.powerUp();

		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");

		Ceiling ceiling = new Ceiling(12, 55);
		Bed bed = new Bed("Modern", 4, 3, 2, 1);
		Lamp lamp = new Lamp("Classic", false, 75);

		Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		bedroom.makeBed();

		bedroom.getLamp().turnOn();

	}
}
