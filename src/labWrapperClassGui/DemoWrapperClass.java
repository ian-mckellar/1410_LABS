package labWrapperClassGui;

public class DemoWrapperClass {
	
	/**
	 * Returns the maximum and minimum values of Bytes, Shorts, Integers, and Longs
	 * @return
	 */
	String minMax() {
		String byteInformation = String.format("Byte: %n"
				+ "Min: %s %n"
				+ "Max: %s %n%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		
		String shortInformation = String.format("Short: %n"
				+ "Min: %s %n"
				+ "Max: %s %n%n", Short.MIN_VALUE, Short.MAX_VALUE);
		
		String integerInformation = String.format("Integer: %n"
				+ "Min: %s %n"
				+ "Max: %s %n%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		String longInformation = String.format("Long: %n"
				+ "Min: %s %n"
				+ "Max: %s", Long.MIN_VALUE, Long.MAX_VALUE);
		
		return byteInformation + shortInformation + integerInformation + longInformation;
		
	}
	
	/**
	 * converts an int into its equivilent of a binary, octal, and hex.
	 * @param number
	 * @return
	 */
	String toBinary(int number) {
		String numberInBinary = Integer.toBinaryString(number);
		String numberInOctal = Integer.toOctalString(number);
		String numberInHex = Integer.toHexString(number);
		
		return String.format("Binary: %s %n"
				+ "Octal: %s %n"
				+ "Hex: %s%n", numberInBinary, numberInOctal, numberInHex);
	}
	
	/**
	 * returns if a character is a whitespace, a digit or a letter.
	 * if the char is a letter it will print {input capitalization}|{opposite capitalization}
	 * @param c
	 * @return
	 */
	String charProperties(char c) {
		boolean isCASpace = false;
		boolean isCADigit = false;
		boolean isCALetter = false;
		String upperAndLower = "";
		
		if (c == ' ') {
			isCASpace = true;
		} else {
			isCASpace = false;
		}
		
		if (Character.isDigit(c)) {
			isCADigit = true;
		} else if (!Character.isDigit(c)) {
			isCADigit = false;
		}
		
		if (Character.isLetter(c)) {
			isCALetter = true;
			if (Character.isUpperCase(c)) {
				upperAndLower = String.format("%s|%s", c, Character.toLowerCase(c));
			} else if (!Character.isUpperCase(c)) {
				upperAndLower = String.format("%s|%s", c, Character.toUpperCase(c));
			}
			
		} else if (!Character.isLetter(c)) {
			isCALetter = false;
		}
		
		return String.format("White space: %b %nDigit: %b %nLetter %s %n%n", isCASpace, isCADigit, (isCALetter ? upperAndLower : isCALetter ));
	}
	
}
