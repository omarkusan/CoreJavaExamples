package ArrayListExample;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Input length of Array:");
		int number = scanner.nextInt();
		int[] array = getIntegers(number);
		printArray(array);
		System.out.println("***************");
		printArray(sortIntegers(array));

	}

	public static int[] getIntegers(int number) {
		if (number > 0) {
			int[] array = new int[number];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Input the " + (i + 1) + " element");
				array[i] = scanner.nextInt();
			}
			return array;
		}
		return null;
	}

	public static void printArray(int[] array) {
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				System.out.println((i + 1) + " : " + array[i]);
			}
		} else {
			System.out.println("Invalid!");
		}
	}

	public static int[] sortIntegers(int[] array) {
		if (array != null) {
			int temp;
			int[] newArray = Arrays.copyOf(array, array.length);
			for (int i = 0; i < newArray.length; i++) {
				for (int j = 0; j < newArray.length - 1; j++) {
					if (newArray[j] < newArray[j + 1]) {
						temp = newArray[j];
						newArray[j] = newArray[j + 1];
						newArray[j + 1] = temp;
					}
				}
			}
			return newArray;
		}
		return null;
		/*
		 * int[] sortedArray = new int[array.length]; for(int i = 0; i <
		 * sortedArray.length; i++){ sortedArray[i] = array[i]; } boolean flag =
		 * true; int temp; while (flag) { flag = false; for (int i = 0; i <
		 * sortedArray.length - 1; i++) { if(sortedArray[i] < sortedArray[i+1]){
		 * temp = sortedArray[i]; sortedArray[i] = sortedArray[i+1];
		 * sortedArray[i+1] = temp; flag = true; } } } return sortedArray;
		 */
	}
}
