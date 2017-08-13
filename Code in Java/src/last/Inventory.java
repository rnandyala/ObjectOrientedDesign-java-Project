package last;
/**
 * The purpose of this abstract class is to give an idea about food and drinks like type of food sweet,hot. Drinks like cold and hot.
 * It also every item sold in the coffee shop.(have a clear notes of what is sold in coffeeExpress etc.)
 * The main purpose is to sell everything in the coffee Express Inventory.
 */
public abstract class Inventory {

	/**
	 * The purpose of this attribute is to provide temperature in degree centigrade
	 */
	private int temperature;
	/**
	 * The Purpose of this attribute is to uniquely identify the item object by seeing digits on it.
	 */
	private int itemId;
	/**
	 * The Purpose of this attribute is to uniquely set the volume  required to sell.
	 */
	private String volume="Grand";

	/**
	 * The purpose of this method is to get details such as small, medium or large
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * The purpose of this method is to get details of number of workers from its super class.
	 */
	public int getWorkers() {
		// TODO - implement Inventory.getWorkers
		throw new UnsupportedOperationException();
	}

	/**
	 * The purpose of this method is to getItem unique id number  of a particular item.
	 */
	public int getItemId() {
return itemId;
	}

	/**
	 * The Purpose  of this is to set the unique id for an Item.
	 * @param itemId
	 */
	public void setItemId(int itemId) {

	}

	/**
	 * The Purpose of this Method is to set the volume of the item like small big  etc.
	 * @param volume
	 */
	public void setVolume(String volume) {

	}

	/**
	 * The Purpose of this method is to compute the price for selected items.
	 */
	public void computePrice() {
	}

	/**
	 * The Purpose of this Operation is to give details like number of items for sale present in the CoffeeExpress.
	 */
	public void noOfItems() {

	}

}