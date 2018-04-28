package labKeyValuePair;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PairApp {

	public static <T> void main(String[] args) {
		KeyValuePair<String, Integer> p1 = new KeyValuePair<>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair<>("NY", 8244910);
		KeyValuePair<String, Integer> p3 = new KeyValuePair<>("LA", 3819702);
		KeyValuePair<String, Integer> p4 = new KeyValuePair<>("SF", 812826);
		
		//KeyValuePair[] cities = {p1, p2, p3, p4};
		List<KeyValuePair<String, Integer>> cities = new ArrayList<>();
		cities.add(p1);
		cities.add(p2);
		cities.add(p3);
		cities.add(p4);
		
		System.out.println("p1: " + p1.toString());
		System.out.println("p2: " + p2.toString());
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		
		System.out.println();
		
		p1 = p2;
		
		System.out.println("p1: " + p1.toString());
		System.out.println("p2: " + p2.toString());
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		
		System.out.println();
		
		System.out.println("Unsorted List:");
		for (KeyValuePair<String, Integer> el : cities) {
			System.out.println(el.toString());
			
		}
		
		System.out.println();
		
		System.out.println("Sorted List:");
		Collections.sort(cities);
		
		for (KeyValuePair<String, Integer> el : cities) {
			System.out.println(el.toString());
			
		}
	}
}
