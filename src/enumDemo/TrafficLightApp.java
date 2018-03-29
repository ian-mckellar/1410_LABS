package enumDemo;

import java.util.Arrays;

public class TrafficLightApp {

	public static void main(String[] args) {
		System.out.println("green: " + TrafficLight.GREEN);
		
		TrafficLight[] allTrafficLights = TrafficLight.values();
		System.out.println("all traffic lights: " + Arrays.toString(allTrafficLights));
		
		for(TrafficLight el : allTrafficLights) {
			System.out.printf("%-6s .. %ds %n", el.toString(), Math.round(el.getDuration()));
			
		}
	}

}
