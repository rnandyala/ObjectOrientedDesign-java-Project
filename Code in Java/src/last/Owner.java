package last;

/**
 * The Purpose of this class is to give the information about the owner such as name and age.
 */
public class Owner {

	/**
	 * The purpose of this attribute is about the name of the owner in CoffeeExpress
	 */
	private String name;
	/**
	 * The Purpose of this Attribute is to have a unique Id in order to login to the software by owner
	 */
	private int password;
	/**
	 * The purpose of this attribute is to uniquely identify Age of the Owner.
	 */
	private int age;
	/**
	 * The Purpose of this attribute is have an identification to uniquely identify owner.
	 */
	private int ownerShipCard;

	/**
	 * The Purpose of this Method is to get the name of the owner.        
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * The purpose of this Method is to set the Name of the owner.
	 * @param name
	 */
	public void setName(String name) {
System.out.println("this is the newly set owner name"+name);
	}

	/**
	 * The Purpose of this method is to get the ownership card details.
	 */
	public int getOwnerShipCard() {
return ownerShipCard;
	}

	/**
	 * The purpose of this Attribute is to Set a new number to the ownership card.
	 * Example:2223 we can change it 3332
	 * @param ownershipCard
	 */
	public void setOwnershipCard(int ownershipCard) {
		// TODO - implement Owner.setOwnershipCard
		System.out.println("this is the newly set owner card: "+ownershipCard);
		}

	/**
	 * The purpose of this method is to get the Password of owner of type integer.
	 */
	public int getPassword() {
return password;
	}

	/**
	 * The purpose of this method is to set the new password to the owner to login into the system.
	 * @param password
	 */
	public void setPassword(int password) {
System.out.println("Owner login password is set to: "+password);
	}

	/**
	 * The Purpose of this attribute is to uniquely identify number of time owner inspects his coffeeExpress.
	 * @param inspects
	 */
	public Owner(int inspects) {

	}

	/**
	 * The purpose of this Method is to uniquely get the age of the owners
	 */
	public int getAge() {
return age;
	}

	/**
	 * The Purpose of this Method is to set the age of owner uniquely.
	 * @param age
	 */
	public void setAge(int age) {
		System.out.println("Reflects age of owner: "+age);

	}
	

}