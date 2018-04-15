package labSerialization;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabSerialization {
	public static void main(String[] args) {
		ListVsSetDemo demo = new ListVsSetDemo(new ColoredSquare(4, Color.RED), new ColoredSquare(6, Color.BLUE),
				new ColoredSquare(4, Color.RED), new ColoredSquare(8, Color.YELLOW));

		String filename = "Demo.ser";
		testDemo(demo);
		serialize(demo, filename);
		ListVsSetDemo newDemo = deserialize(filename);
		testDemo(newDemo);
	};

	private static void serialize(ListVsSetDemo demo, String filename) {
		try (ObjectOutputStream writer = new ObjectOutputStream(
				new FileOutputStream("src/labSerialization/Resources/" + filename))) {
			writer.writeObject(demo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static ListVsSetDemo deserialize(String filename) {
    	try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream("src/labSerialization/Resources/" + filename))) {
    		ListVsSetDemo newDemo  = (ListVsSetDemo) reader.readObject();
    		return newDemo;
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
    	
    }

	private static void testDemo(ListVsSetDemo demo) {
		System.out.println("List:");
		System.out.println(demo.getListElements());
		System.out.println("Set:");
		System.out.println(demo.getSetElements());
	}

}
