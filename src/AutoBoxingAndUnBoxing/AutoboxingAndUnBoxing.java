package AutoBoxingAndUnBoxing;

import java.util.ArrayList;

public class AutoboxingAndUnBoxing {
	public static void main(String[] args) {
		String[]strArray = new String[10];
		int[] intArray = new int[10];
		ArrayList<String> strArrayList = new ArrayList<>();
		strArrayList.add("Omar");
		System.out.println("strArrayList siz: " + strArrayList.size());
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.25);
		ArrayList<Integer> intArrayList = new ArrayList<>();
		Integer myInValue = 56;
		int myInt = myInValue.intValue();
		
		ArrayList<Double> myDoubleValue = new ArrayList<>();
		for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
			myDoubleValue.add(dbl);
		}
		for(int i = 0; i < myDoubleValue.size(); i++){
			double value = myDoubleValue.get(i);
			System.out.println(i + " --> " + value);
		}
	}
}
