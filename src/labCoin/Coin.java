package labCoin;

import org.junit.platform.commons.util.ToStringBuilder;

public enum Coin {
	CENT(2.500, 19.05), NICKEL(5.000, 21.21), DIME(2.268, 17.91), QUARTER(5.670, 24.26);
	
	private final double weight; //in grams
	private final double diameter; // in mm
	
	private Coin(double weight, double diameter) {
		this.weight = weight;
		this.diameter = diameter;
	}
	
	@Override
	public String toString() {
		return String.format("%s w:%.1f d:%.1f", super.toString(), weight, diameter);
	}
}
