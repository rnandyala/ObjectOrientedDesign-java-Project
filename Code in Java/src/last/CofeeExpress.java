package last;

import java.util.*;

/**
 * The purpose of this class is to provide type of varieties it is having. workers for making arrangements like selling stuff.
 */
 class CoffeeExpress {

	/**
	 * The purpose of this attribute is to have a unique number of Customers this is of type integer here it is 1 to n for the span of coffeeExpress.
	 */
	private Collection<Customers> noOfCustomers;
	/**
	 * The purpose of this attribute is to have a unique number of Employees this is of type integer here it is one.
	 */
	private Employee noOfEmployee;
	/**
	 * The purpose of this attribute is to have a unique number of owner this is of type integer it is one owner in coffee Express.
	 */
	Owner noOfOwner;

	/**
	 * The Purpose of this Method is to add the Items in to the Inventory by owner it can be any item like cakes,coffee,etc.
	 * @param Item
	 * @param number
	 */
	public void addItems(Inventory Item, Owner numbe) {
		// TODO - implement CoffeeExpress.addItems
	System.out.println("Item added by using owner Id into the software or inventory" );
	}

	/**
	 * The Purpose of this Method is to Delete the Sold Items from the Inventory or software.This is to be done by the owner        
	 * @param number
	 */
	public void deleteSoldItem(Owner number) {
System.out.println("Items are deleted by the owner which are sold");
	}

	/**
	 * The Purpose of this method is to calculate the Total profit By the owner for a single transaction.
	 * @param total
	 */
	public void totalProfit(Owner total) {
		
System.out.println("profit is calculated by owner" );
	}

	/**
	 * The Purpose of this method is to look or search for a particular item in the Inventory like it can be coffee,cakes,water bottle etc       
	 * @param ItemId
	 */
	public void lookParticularItem(Inventory ItemId) {
		// TODO - implement CoffeeExpress.lookParticularItem
System.out.println("search whether the item is present or not in the inventory by using unique Id");
	}

	/**
	 * The purpose of this method is about the payment which was done by the customer and it was taken by the Employee        
	 * @param giveMoney
	 * @param money
	 */
	public void makePayment(Customers giveMoney, Employee money) {
		// TODO - implement CoffeeExpress.makePayment
	System.out.println("money is exchanged between employee and customer");
	}

	/**
	 * The Purpose of this method is for The employee can cancel the order before it is made like cancel donut and order new coffee.
	 * @param item
	 */
	public void cancelOrderBeforeMade(Employee item) {
		// TODO - implement CoffeeExpress.cancelOrderBeforeMade
		System.out.println("order is cancle before the purchase by employee");

	}

	/**
	 * The Purpose of this method is to return the Item can be like donuts,cakes etc and refund the Item by the Employee.       
	 * @param Item
	 * @param refund
	 */
	public void returnItem(Inventory Item, Employee refund) {
		// TODO - implement CoffeeExpress.returnItem
System.out.println("items is returned and money is refunded by employee");
	}

	/**
	 * The purpose of this method is to Ask for the Help Like Return items,cancel order an other information. here Employees will help the customers
	 * @param item
	 * @param thing
	 */
	public void askHelp(Customers item, Employee thing) {
		System.out.println("look for particular item in the shop by employee");
	}

	/**
	 * The Purpose of this method is to Make fresh items for the Customers by the employee.like it can be of different size color etc      
	 * @param item
	 * @param thing
	 */
	public void makeFreshItem(Customers item, Employee thing) {
		System.out.println("Fresh Item is prepared ");
	}

	/**
	 * The Purpose of this Method is about purchase or buy the items by the customers in the coffee express
	 * @param item
	 */
	public void buyItem(Customers item) {
	System.out.println("mentioning customer is intereseted to buy in coffeeExpress");
	}

/**
	 * The Purpose of this Method is about updating in the inventory or software by employee. It can be items from eatable to drinks.
	 * @param Item
	 * @param thing
	 */
	public void syncNewItem(Inventory Item, Employee thing) {
System.out.println("Items are updated by employee inthe software");
	}

	/**
	 * The purpose of this Constructor is to create a new unique object helps to generate unique things here it display string when object is created.
	 * @param display
	 */
	public CoffeeExpress(String display) {
		System.out.println(display);

	}

	/**
	 * The purpose of this method is to cancel order after it is made by the employee like when the coffee order is green and customer want to change to black coffee then he Employee cancels order after it is made.
	 * @param item
	 */
	public void cancelOrderAfterMade(Employee item) {
		// TODO - implement CoffeeExpress.cancelOrderAfterMade
System.out.println("employee cancels items after billing is made");
	}

	/**
	 * The purpose of this method is that employee takes customer order.
	 */
	public void enterOrder() {
System.out.println("employe or owner enters order in to the software");
	}

	/**
	 * The Purpose of this method is to give an indication that order is successfully completed.
	 */
	public void completeOrder() {
System.out.println("successfully transaction is made between customer,owner and employee");
	}
	/**
	 * This is main method with no return type from here it starts executing the code.
	 * @param args
	 */


	public static void main(String[] args) {
		
	
		
		System.out.println("Customer walks in and talks to Employee.\n");
    	
    	
    	
    	// Employee now uses our software to create Order object:
    	CoffeeExpress newItem = new CoffeeExpress("welcome to Coffee Express");
    	Owner owns=new Owner(2);
    
    	owns.setName("kim");
    	owns.setAge(45);
    	owns.setOwnershipCard(1234);
    	owns.setPassword(23232);
    	
    	Coffee smallCoffee = new Coffee(100);
    	
    	
    	Drinks water = new Drinks("large");
    	Customers honest =new Customers(10);
    	Employee banker=new Employee(200);
    	banker.setAge(24);
    	banker.setAttitude("humble");
    	banker.setPassword(007);
    	banker.setUserName("killfear");
    	System.out.println("details entered by employee to access the machine is:\n");
    	System.out.println(banker.toString());
    	// if customer ask a special or fresh item them 
    	CoffeeBeans beans=new CoffeeBeans("brown");
    	System.out.println("number of beans are:"+beans.getNoOfBeans());
    	System.out.println("shape of beans should be like: "+beans.getShape());
    	Cakes vanila=new Cakes(10);
    	System.out.println("temperature of cakes vanila are"+vanila.getTemperature()+" degrees each.");
    	vanila.setTemperature(25);
    	
    	newItem.enterOrder();
    	// if customer ask a special or fresh item them 
    	FreshlyMade specialItem=new FreshlyMade("medium","sweet");
  System.out.println(  specialItem.toString());
 
  System.out.println("ALL getter methods in Drinks class \t");
  System.out.println(water.toString());
    	newItem.addItems(smallCoffee,owns);
    	
    	newItem.addItems(water,owns);
    	newItem.deleteSoldItem(owns);
    	newItem.totalProfit(owns);
    	
    	newItem.completeOrder();
    	newItem.lookParticularItem(water);
    	System.out.println(smallCoffee.getMilkQuantity()+": grams of milk " +"is required to prepare"+""
    			+"a small coffee");
    	System.out.println(smallCoffee.getBrand()+" this is  the brand of coffee \n");
    	newItem.makePayment(honest, banker);
    	newItem.cancelOrderBeforeMade(banker);
    	newItem.returnItem(water, banker);
    	newItem.makeFreshItem(honest,banker);
    	newItem.buyItem(honest);
    	newItem.syncNewItem(smallCoffee, banker);
    	newItem.cancelOrderAfterMade(banker);
    	newItem.completeOrder();
    	
    	System.out.println("Order is complete.");
 honest.remainingChange(29);   	
	}
	}


