package last;

/**
 * The Purpose of this class gives the details of customers,like Brand and items etc.
 */
public class Customers {

	/**
	 * The purpose of this attribute is to uniquely identify the brand.
	 * example nest cafe, whole cafe
	 */
	private int brand;
	/**
	 * The Purpose of this attribute is to provide unique number of items required by customer.
	 */
	private int items;

	/**
	 * The Purpose of this method is to get the Brand that a customer needs.
	 */
	public int getBrand() {
		return brand;

	}

	/**
	 * The Purpose of this Method is to set a unique brand for the customer.
	 *        
	 * @param Brand
	 */
	public void setBrand(String Brand) {

	}

	/**
	 * The purpose of this method is to calculate the remaining change to buy further items by the customer.
	 * @param money
	 */
	public void remainingChange(float money) {
System.out.println("change customer have to buy new item: "+money );
	}

	/**
	 * The Purpose of this Method is to get the  number of items uniquely needed by the customer.
	 */
	public int getItems() { return items;

	}

	/**
	 * The purpose of this Method is to set the number of Items required for a customer.
	 * @param number
	 */
	public void setItems(int number) {

	}

	/**
	 * The purpose of this method is to uniquely identify number of varieties required for a customer. 
	 * @param count
	 */
	public Customers(int count) {
System.out.println("Number of varities required are: "+count);
	}

}