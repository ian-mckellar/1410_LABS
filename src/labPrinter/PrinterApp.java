package labPrinter;

import java.util.ArrayList;

public class PrinterApp {

	public static void main(String[] args) {
		InkjetPrinter inkjetPrinter = new InkjetPrinter(1234567);
		LaserPrinter laserPrinter = new LaserPrinter(2345678);

		System.out.print(inkjetPrinter.toString());
		System.out.println("Remaining Catridge: " + inkjetPrinter.getRemainingCartridge() + "%");
		System.out.println();
		System.out.print(laserPrinter.toString());
		System.out.println("Remaining Toner: " + laserPrinter.getRemainingToner() + "%");
		System.out.println();

		ArrayList<Printer> printers = new ArrayList<>();
		printers.add(inkjetPrinter);
		printers.add(laserPrinter);

		for (Printer printer : printers) {
			if (printer instanceof InkjetPrinter) {
				System.out.print(inkjetPrinter.toString());
				for (int i = 0; i <= 10; i++) {
					inkjetPrinter.print();
				}
				System.out.println();
			} else if (printer instanceof LaserPrinter) {
				System.out.print(laserPrinter.toString());
				for (int i = 0; i <= 10; i++) {
					laserPrinter.print();
				}
			}
		}
	}
}
