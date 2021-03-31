

/**
 * Represents a customer of a bank.
 *
 */
public class Customer {
	/**
	 * Name of customer.
	 */
	String name;
	
	/**
	 * Address of customer.
	 */
	String address;
	
	/**
	 * Creates a customer with the given name
	 * @param name of customer
	 */
	public Customer(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the address of the customer to the given address.
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * returns customer name
	 * @return name of customer
	 */
	public String getName() {
		return name;
	}

	/**
	 * returns customer address
	 * @return address of customer
	 */
	public String getAddress() {
		return address;
	}
	
	
	public String toString() {
		return this.getName() + " " + this.getAddress();
	}
}
