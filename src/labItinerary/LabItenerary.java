package labItinerary;

import java.util.ArrayList;
import java.util.Scanner;

public class LabItenerary {
	
	public static void main(String[] args) {
		ArrayList<String> itinerary = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
	    StringBuilder sb = new StringBuilder();
	    
		while (true) {
	        System.out.print("Destination: ");
	        String stringToAdd = scanner.nextLine();
	        
	        if(stringToAdd.toLowerCase().equals("done")) { //use equals ignore case
	        	System.out.println("Be on your way!");
	            break;
	        }
	        
	        itinerary.add(stringToAdd);   
	    }
		
		for (int i = 0; i <= itinerary.size() - 1; i ++) {
			sb.append(itinerary.get(i).toUpperCase() + " " + "to ");
		}
		
		sb.delete(sb.length() - 3, sb.length());
		
		System.out.println(sb);
		
	}
}
