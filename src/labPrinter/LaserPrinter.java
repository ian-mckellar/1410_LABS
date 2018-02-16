package labPrinter;

/**
 * Represents a laser printer with a serial number, toner, and that can print
 * 
 * @author ian
 *
 */
public class LaserPrinter extends Printer {
	private int remainingToner;

	/**
	 * Initializes a new LaserPrinter that starts with 100% of a toner
	 * 
	 * @param sNumber
	 */
	public LaserPrinter(int sNumber) {
		super(sNumber);
		this.remainingToner = 100;
	}

	/**
	 * Returns the percentage of how much of the toner is left
	 * 
	 * @return
	 */
	public int getRemainingToner() {
		return remainingToner;
	}

	/**
	 * If there is any positive number in remainingToner prints a string of the
	 * following format: LaserPrinter is printing. Remaining Toner
	 * {remainingToner}%"
	 * 
	 * if there is 0 or less in the Toner prints a string of the following format:
	 * "the toner is empty"
	 */
	@Override
	public void print() {
		if (remainingToner > 0) {
			System.out.printf("The LaserPrinter is printing.  Remaining Toner: %d%% %n", remainingToner);
		} else {
			System.out.println("The toner is empty.");
		}
		remainingToner -= 10;
	}
}
