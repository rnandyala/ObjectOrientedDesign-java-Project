package last;

/**
 * The purpose of this class is to provide brand, No of minerals, Volume.
 */
public class Drinks extends Inventory {

	/**
	 * The purpose of this attribute is to provide brand kinley, aquafina etc
	 */
	private String brand="Kinley";
	/**
	 * The purpose of this attribute is to provide no of minerals in a water bottle.
	 */
	private int noOfMinerals=10;
	/**
	 * The purpose of this attribute is provide number of oz in a water bottle.
	 */
	
	public int getNoOfMinerals() {
		return noOfMinerals;
	}

	/**
	 * The purpose of this method is set a particular brand to a water bottle.
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * The purpose of this method is to get what brand is it exactly.
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * The purpose of this method is to set particular number of minerals.
	 * @param noOfMinerals
	 */
	public void setNoOfMinerals(int noOfMinerals) {
		// TODO - implement Drinks.setNoOfMinerals
		throw new UnsupportedOperationException();
	}

	/**
	 * The purpose of this method constructor is to set particular brand.
	 * @param size
	 */
	public Drinks(String size) {
		// TODO - implement Drinks.Drinks
System.out.println("required drink size is "+size);
	}
	

	/**
	 * The purpose of this method to particularly look barcode of WaterBottle.
	 * @param barcode
	 */
	public void look(int barcode) {

	}
	

	/**
	 * The purpose of this method is to see whether item WaterBottle  is present or not
	 * @param particularDrink
	 */
	public void checkParticularDrink(boolean particularDrink) {
	}	// TODO - implement Drinks.checkParticularDrink
		public String toString(){
		return"<"+"Intrested brand of water is: "+getBrand()+" of volume   & minerals as "
				+ ""+getVolume()+" "+getNoOfMinerals()+">";
	

}
}