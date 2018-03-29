package balloon;

/**
 * Represents a balloon with a given size and and is filled with air or helium
 * 
 * @author Ian McKellar
 *
 */
public class Balloon {
	private Size size;
	private String type; // air or helium

	/**
	 * initializes a balloon object with a type (helium or air) and a size
	 * 
	 * @param size
	 * @param type
	 */
	public Balloon(Size size, String type) {
		this.size = size;
		this.type = type;
	}

	/**
	 * returns the size of the balloon object
	 * 
	 * @return
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * returns the type of the balloon object (helium or air)
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/**
	 * overrides equals() method to check if two different balloons types and sizes
	 * are equal to each other
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balloon other = (Balloon) obj;
		if (size != other.size)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	/**
	 * overrides toString() method to print "{type} {size}"
	 */
	@Override
	public String toString() {
		return type + " " + size;
	}
}
