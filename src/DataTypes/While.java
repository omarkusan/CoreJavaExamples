package DataTypes;

import java.util.Spliterator;

public class While {
	public static void main(String[] args) {
		int number = 5;
		int finishNumber = 20;
		int numberOfEvenNumbers = 0;
		while (number <= finishNumber) {
			if (!isEvenNumber(number)) {
				number++;
				continue;
			}
			System.out.println("Even number " + number);
			numberOfEvenNumbers++;
			if (numberOfEvenNumbers >= 5) {
				break;
			}
			number++;
		}
		System.out.println("Total even numbers found = " + numberOfEvenNumbers);

	}

	public static boolean isEvenNumber(int number) {
		if ((number % 2) == 0) {
			return true;
		}
		return false;
	}

}
