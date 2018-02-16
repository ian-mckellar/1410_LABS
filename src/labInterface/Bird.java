package labInterface;

/**
 * Represents a bird that can fly
 * 
 * @author ian
 *
 */
public class Bird implements Flyable {
	private final String type;

	/**
	 * Initializes a new type of bird as type string
	 * 
	 * @param t
	 */
	public Bird(String t) {
		type = t;
	}

	/**
	 * Returns the type of bird as a string in the format "{type}"
	 */
	@Override
	public String toString() {
		return type;
	}

	/**
	 * Overrides launch() and prints out "Flapping the wings to take off" to signify
	 * the bird is starting to fly
	 */
	@Override
	public void launch() {
		System.out.println("Flapping the wings to take off");
	}

	/**
	 * Overrides land() and prints out "Flapping the wings until landing" to signify
	 * the bird is landing
	 */
	@Override
	public void land() {
		System.out.println("Flapping the wings until landing");
	}
}
