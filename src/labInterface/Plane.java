package labInterface;

/**
 * Represents a plane that can fly
 * 
 * @author ian
 *
 */
public class Plane implements Flyable {
	private final int numberOfEngines;
	private final String model;

	/**
	 * Initializes a new plane with numberOfEngines and a model
	 * 
	 * @param engines
	 * @param m
	 */
	public Plane(int engines, String m) {
		numberOfEngines = engines;
		model = m;
	}

	/**
	 * Returns a string with the following format: "{model} with {numberOfEngines}
	 * engines"
	 */
	@Override
	public String toString() {
		return String.format("%s with %d engines", model, numberOfEngines);
	}

	/**
	 * Overrides launch to print "Rolling until take off"
	 */
	@Override
	public void launch() {
		System.out.println("Rolling until take off");
	}

	/**
	 * Overrides land() to print "Rolling to a stop"
	 */
	@Override
	public void land() {
		System.out.println("Rolling to a stop");
	}
}
