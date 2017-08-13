
package last;
/**
 * The purpose of this class is give details of a coffee like brand, quantity of milk used.
 */
public class Coffee extends Inventory {

	/**
	 * The purpose of this attribute is provide whether color is brown, black
	 */
	private String color;
	/**
	 * The purpose of this attribute give particular brand like nescafe, nestle, etc.
	 */
	private String brand="GreenMountain";
	/**
	 * The purpose of this attribute is to provide particular quantity of milk like 20oz,30oz etc.
	 */
	private int milkQuantity;

	/**
	 * The purpose of this method is to get whether coffee is black or brown.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * The purpose of this method is to set particular color like brown and black.
	 * @param colour
	 */
	public void setColor(String color) {
		// TODO - implement Coffee.setColour
		throw new UnsupportedOperationException();
	}

	/**
	 * The purpose of this method is to set brand nestle or nescafe.
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * The purpose of this method is to set nescafe or nestle
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * The purpose of this constructor is  to create a new unique coffee object and provide number of cups present in the system
	 * @param noOfCups
	 */
	public Coffee(int noOfCups) {

	}

	/**
	 * The purpose of this method is to  get the unique quantity of  milk required in oz
	 */
	public int getMilkQuantity() {
		return milkQuantity;

	}

	/**
	 * The purpose of this method to increase temperature to 100 degrees
	 * @param temperature
	 */
	public void IncreaseTemperature(int temperature) {
		// TODO - implement Coffee.IncreaseTemperature
		throw new UnsupportedOperationException();
	}

	/**
	 * The purpose of this method is to the the milk quantity uniquely to particular integer type.
	 * @param milkQuantity
	 */
	public void setMilkQuantity(int milkQuantity) {

	}

}