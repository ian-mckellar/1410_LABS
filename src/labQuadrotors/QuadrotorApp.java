package labQuadrotors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrotorApp {
	
	/**
	 * Swaps the x and y positions
	 * @param rotors
	 */
	private static void changeOrientation(List<Quadrotor> rotors) {
		for (int i = 0; i < rotors.size(); i++) {
			int x = rotors.get(i).getX();
			int y = rotors.get(i).getY();
			
			int newX = y;
			int newY = x;
			
			rotors.get(i).setX(newX);
			rotors.get(i).setY(newY);
		}
	}
	
	/**
	 * Looks through the list of rotors and returns a count for how 
	 * many of the rotors are equal to the item passed through it
	 * 
	 * if you try and remove search item you get an error:
	 * 
	 * Exception in thread "main" java.lang.UnsupportedOperationException
	 * at java.util.AbstractList.remove(AbstractList.java:161)
	 * at labQuadrotors.QuadrotorApp.searchForEqualRotors(QuadrotorApp.java:41)
	 * at labQuadrotors.QuadrotorApp.main(QuadrotorApp.java:61)
	 * 
	 * @param rotors
	 * @param searchItem
	 * @return
	 */
	private static String searchForEqualRotors(List<Quadrotor> rotors, Quadrotor searchItem) {
		int count = 0;
		for (int i = 0; i < rotors.size(); i++) {
			
			if (searchItem.equals(rotors.get(i))) {
				count++;
				//rotors.remove(i);
			}
		}
		if (count == 0) {
			return String.format("rotors does not contain %s ", searchItem.toString());
		} else {
			return String.format("rotors contains %s", searchItem.toString());
		}
		
	}
	
	public static void main(String[] args) {
		List<Quadrotor> rotors = new ArrayList<>(Arrays.asList(
				new Quadrotor(2, 4, 2), new Quadrotor(3, 4, 4), new Quadrotor(4, 4, 6),
				new Quadrotor(5, 4, 2), new Quadrotor(6, 4, 4), new Quadrotor(7, 4, 6)));
		Quadrotor searchItem = new Quadrotor(4, 6, 4);
		System.out.println(rotors.toString());
		
		changeOrientation(rotors);
		System.out.println(rotors.toString());
		System.out.println(searchForEqualRotors(rotors, searchItem));
		
		int count = 0;
		int numberOfRotors = 0;
		for (int i = 0; i < rotors.size(); i++) {
			numberOfRotors++;
			if (searchItem.equals(rotors.get(i))) {
				count++;
				//rotors.remove(i);
			}
		}
		if (count == 0) {
			System.out.printf("rotors does not contain %s %n", searchItem.toString());
		} else {
			System.out.printf("rotors contains %s %n", searchItem.toString());
		}
		System.out.printf("number of rotors: %d %n", numberOfRotors);
		
		rotors.remove(searchItem);
		System.out.println(rotors);
		rotors.remove(rotors.get(0));
		System.out.println(rotors.toString());
	}

	
	
}
