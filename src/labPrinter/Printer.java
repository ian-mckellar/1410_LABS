package labPrinter;

/**
 * Represents a printer with a serial number that can print
 * 
 * @author ian
 *
 */
public abstract class Printer {
	private int serialNumber;

	public Printer(int serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + String.format(" #%d%n", serialNumber);
	}

	public abstract void print();
}
