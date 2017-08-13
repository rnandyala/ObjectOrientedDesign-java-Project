package last;

/**
 * The purpose of this Class is about the Employee Details like Username,password and age
 */
public class Employee {

	/**
	 * The purpose of this Attribute is to have a unique password to log in to the software system or Inventory.
	 */
	private int password=1234;
	/**
	 * The purpose of this attribute is to notice unique Attitude for an employee
	 */
	private String attitude="gentle";
	/**
	 * The purpose of this method is about the username of the Employee to login into the software
	 */
	private String userName="kelwin";
	/**
	 * The purpose of this attribute is about the age. helps to hire a young employee so that he can work for a long time.
	 */
	private int age=23;

	/**
	 * The purpose of this method is to get the password  of an employee
	 */
	public int getPassword() {
return password;
	}

	/**
	 * The purpose of this Method is to set unique password of an employee
	 * @param password
	 */
	public void setPassword(int password) {
		
System.out.println("new password for employee is:"+password);
	}

	/**
	 * The Purpose of this method is to uniquely identify the character of an employee.
	 */
	private String getAttitude() {
return attitude;
	}

	/**
	 * The Purpose of the method is to set attitude of an employee. This is of type String.
	 * @param attitude
	 */
	public void setAttitude(String attitude) {
		
System.out.println("charcter should be like"+attitude);
	}

	/**
	 * The purpose of this method is to get user name of an Employee to uniquely need in the system to login.
	 */
	public String getUserName() {
return userName;
	}

	/**
	 * The purpose of this method is to set the username of an employee to login to the software.
	 * @param userName
	 */
	public void setUserName(String userName) {
		
System.out.println("new user name of Employee"+userName);
	}

	/**
	 * The purpose of this Constructor is to uniquely set the salary object for the Employee.
	 * @param salary
	 */
	public Employee(int salary) {
System.out.println("Employee salary is as follows in dollars:"+salary );
	}

	/**
	 * The purpose of this method is to  uniquely get the age of an Employee
	 */
	public int getAge() {
return age;
	}

	/**
	 * The purpose of this method is to set unique age for an employee to work in CoffeeExpress.
	 * @param age
	 */
	public void setAge(int age) {
		age=24;
System.out.println("age of employee"+age);
	}
	public String toString(){
		return"<"+"Employee details are as follows:"+"age: "+
	getAge()+"login details to get to access the inventory"+getUserName()+
				+getPassword()+"kind of human:  "+getAttitude()+">";
	}

}