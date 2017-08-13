package last;

/**
 * The purpose of this class is to specially makeup  things for the customer like color,toppings,size etc.
 */
public class FreshlyMade extends Inventory {

	/**
	 * The purpose of this attribute is to have a unique color of type string.
	 */
	private String color="brown";
	/**
	 * The purpose of this attribute is to have a unique number of topping this is of type integer.
	 */
	private int toppings=5;

	/**
	 * The purpose of this method is to getcolor uniquely for a freshly made item.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * The purpose of this method is to get topping number uniquely required for a customer.
	 */
	public int getToppings() {
		
		return toppings;
	}

	/**
	 * The purpose of this method is to set Toppings uniquely required for a customer.
	 * @param toppings
	 */
	public void setToppings(int toppings) {
		 toppings=10;
	}

	/**
	 * The purpose of this method is to Set unique color depending on the request of customer for a freshly or specially made item.
	 * @param color
	 */
	public void setColor(String color) {
		 color="white";
	}

	/**
	 * The purpose of this method is to create a new unique freshly made object  helps to generate unique things for a customer.
	 * @param size
	 * @param taste
	 */
	public FreshlyMade(String size, String taste) {
		
		System.out.println("Special item with: "+size+"&  "+taste);
			}

	/**
	 * The purpose of this method is to to give details like number of uniquely freshly made items required by the customer.
	 */
	@Override
	public void noOfItems() {
		// TODO - implement FreshlyMade.noOfItems
		throw new UnsupportedOperationException();
	}
	public String toString(){
		return "<"+"special item list given by customer: \n"
	              +"number of toppings as\t"+toppings+"  color of drink as \t"+color+ ">";
	}

}