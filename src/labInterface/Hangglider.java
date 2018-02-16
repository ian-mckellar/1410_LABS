package labInterface;

/**
 * Represents a hang glider that can fly
 * 
 * @author ian
 *
 */
public class Hangglider implements Flyable {
	private final boolean isRigidWing;

	/**
	 * Initializes a new new hang glider with isRigidWing as type boolean
	 * 
	 * @param rigidWing
	 */
	public Hangglider(boolean rigidWing) {
		isRigidWing = rigidWing;
	}

	/**
	 * Checks the boolean as true or false. If true prints "Rigid-wing" if false
	 * prints "Flex-wing"
	 */
	@Override
	public String toString() {
		return String.format(isRigidWing ? "Rigid-wing" : "Flex-wing");
	}

	/**
	 * Over rides launch to print "Running until take off" to signify that the hang
	 * glider is taking off
	 */
	@Override
	public void launch() {
		System.out.println("Running until take off");
	}

	/**
	 * Over rides land() to print "Gliding to a land" to signify that the hang
	 * glider is landing
	 */
	@Override
	public void land() {
		System.out.println("Gliding to a land");
	}
}
