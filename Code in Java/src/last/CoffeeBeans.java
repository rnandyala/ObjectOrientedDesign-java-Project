package last;
/**
 * The purpose of this class is to give details like number of beans and shape of each bean.
 */
public class CoffeeBeans extends Inventory {

	/**
	 * The purpose of this attribute is provide number of beans required for coffee.
	 */
	private int noOfBeans=12;
	/**
	 * The purpose of this attribute is provide particular shape oval,rectangular and circular.
	 */
	private String shape= "wide";

	/**
	 * The purpose of this method to get number of beans required for the coffee
	 */
	public int getNoOfBeans() {
		return noOfBeans;
	}

	/**
	 * The purpose of this method is to set number of beans required for a coffee preparation.
	 * @param noOfBeans
	 */
	public void setNoOfBeans(int noOfBeans) {
		this.noOfBeans = noOfBeans;
	}

	/**
	 * The purpose of this method is to get in what shape bean actual is.
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * The purpose of this method is to set to particular shape like circular, oval etc.
	 * @param shape
	 */
	public void setShape(String shape) {
		this.shape=shape;
	}

	/**
	 * The purpose of this method is to provide circular,oval etc.
	 * @param circular
	 */
	public CoffeeBeans(String circular) {
		
		System.out.println("coffee beans are Circular with color"+circular);
	}

	/**
	 * The purpose of this method is to measure volume of coffee beans
	 * like small,large etc
	 */
	public String getVolume() {
		return "thickBrown";
	}

}