package labPrinter;

/**
 * Represents an inkjet printer with a serial number, cartridge, and that can
 * print
 * 
 * @author ian
 *
 */
public class InkjetPrinter extends Printer {
	private int remainingCartridge;

	/**
	 * Initializes a new InkjetPrinter that starts with 100% of a cartridge
	 * 
	 * @param sNumber
	 */
	public InkjetPrinter(int sNumber) {
		super(sNumber);
		this.remainingCartridge = 100;
	}

	/**
	 * Returns the percentage of how much of the cartridge is left
	 * 
	 * @return
	 */
	public int getRemainingCartridge() {
		return remainingCartridge;
	}

	/**
	 * If there is any positive number in remainingCartridge prints a string of the
	 * following format: "InkjetPrinter is printing. Remaining Cartridge
	 * {remainingCartridge}%"
	 * 
	 * if there is 0 or less in the cartridge prints a string of the following
	 * format: "the cartridge is empty"
	 */
	@Override
	public void print() {
		if (remainingCartridge > 0) {
			System.out.printf("InkjetPrinter is printing.  Remaining Cartridge %d%% %n", remainingCartridge);
		} else {
			System.out.println("the cartridge is empty");
		}
		remainingCartridge -= 10;
	}
}
