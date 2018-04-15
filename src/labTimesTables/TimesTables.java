package labTimesTables;

import java.io.IOException;
import java.io.PrintWriter;

public class TimesTables {

	public static void main(String[] args) {
		try(PrintWriter write = new PrintWriter("src/labTimesTables/Resources/TimeTables.txt")) {
			for (int i = 1; i <= 10; i += 2) {
				for (int j = 1; j <=10; j++) {
					write.printf("%2d * %-1d = %-2d           %2d * %-1d = %-2d%n", j, i, j * i, j, i + 1, (j + 1) * (i + 1));
				}
				write.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
