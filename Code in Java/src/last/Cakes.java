package last;

/**
 * The purpose of this class is to give no of things it is having and grams.
 */
public class Cakes extends Inventory {

	/**
	 * The purpose of this attribute is provide number of things 20 cakes.
	 */
	private int noOfThings;
	/**
	 * The purpose of this attribute is to provide number of grams each cake is.
	 */
	private int noOfGrams;
	/**
	 * The purpose of this attribute is to know whether it is hot or cold by knowing temperature.
	 */
	private int temperature=20;

	/**
	 * The purpose of this method is to get no of cakes present
	 */
	public int getNoOfThings() {
		return noOfThings; 
	}

	/**
	 * The purpose of this method is to set number of things like 30 cakes
	 * @param noOfThings
	 */
	public void setNoOfThings(int noOfThings) {
		this.noOfThings = noOfThings;
	}

	/**
	 * The purpose of this method is to get details of each cake may be 100 grams.
	 */
	public int getNoOfGrams() {
		// TODO - implement Cakes.getNoOfGrams
		return noOfGrams;
	}

	/**
	 * The purpose of this method is to set into particular grams like 150 each cake.
	 * @param noOfGrams
	 */
	public void setNoOfGrams(int noOfGrams) {
		this.noOfGrams = noOfGrams;
	}

	/**
	 * The purpose of this constructor is to give details like 100 cakes in store.
	 * @param value
	 */
	public Cakes(int value) {
		System.out.println("Number of cakes required are"+value);
	}

	/**
	 * The purpose of this method is to see whether particular band is there or not
	 * @param kinley
	 */
	public void particularBrand(String kinley) {
		// TODO - implement Cakes.particularBrand
		throw new UnsupportedOperationException();
	}

	/**
	 * The purpose of this method is to get what temperature cake is.
	 */
	public int getTemperature() {
		// TODO - implement Cakes.getTemperature
	return temperature;
	}

	/**
	 * The purpose of this method is to set temperature to particular degrees usually cod or hot.
	 * @param temperature
	 */
	public void setTemperature(int temperature) {
		System.out.println("Set the temperature approximately to :"+temperature+" degrees");
	}

}