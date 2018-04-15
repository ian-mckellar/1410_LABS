package labFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MountainApp {

	public static void main(String[] args) {
		List<Mountain> mountainList = new LinkedList<>();

		try (Scanner reader = new Scanner(MountainApp.class.getResourceAsStream("Mountains.csv"))) {
			while (reader.hasNextLine()) {
				Mountain newMountain = getMountain(reader.nextLine());
				if (newMountain != null) {
					mountainList.add(newMountain);
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			for (Mountain el : mountainList) {
				System.out.println(el);
			}
		}
	}

	private static Mountain getMountain(String nextLine) {
		Mountain returnMountain = null;
		try {
			String[] mountainList = nextLine.split(",");
			returnMountain = new Mountain(mountainList[0], Integer.parseInt(mountainList[1]),
					Boolean.parseBoolean(mountainList[2]));
		} catch (IllegalArgumentException e) {
			System.err.println(".. cound not be read in as a mountain.");
		}
		return returnMountain;
	}
}
