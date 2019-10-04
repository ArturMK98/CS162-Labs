public class Person {

	// Attributes
  	private String name;
	private String address;
	private int ppsNo;
	
	// Class Variables
	private static int counter = 1001; // used to remember the last ppsNo assigned

	// Default Constructor
	/**
     * Creates a Person with default values
	 */
	public Person() {
		//calling setter method to assign values to Person attributes
		setName("");
		setAddress("");
		ppsNo = counter++;
	}

	// General Constructor
	/**
	 * Creates a new Person with the details provided and assigns it a unique ppsNo
	 * @param name The name this Person has
	 * @param address The address of this Person
	 *
	 */
  	public Person (String personName, String personAddress) {
  		//Assign values to a Person
		name = personName;
		address = personAddress;
    	ppsNo = counter++;
	}

	// Accessors and Mutators
	/**
	 * 	Gets the name of this Person
	 *	@return name
	 */
	public String getName() { 
		return name;
	}

	/**
	 * 	Gets the address of this Person
	 *	@return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 	Gets the ppsNo of this Person
	 *	@return ppsNo
	 */
	public int getPPSNo() {
		return ppsNo;
	}

	/**
	 * Sets the name of the Person to the new one provided.
	 * @param name The new name of the Person.
	 */
	public void setName(String personName) {
		name=personName;
	}

	/**
	 * Sets the address of the Person to the new one provided.
	 * @param address The new address of the Person.
	 */
	public void setAddress(String personAddress) {
		address=personAddress;
	}
	
	public String toString() {
	    
	    return "NAME: " + name + '\n' + "ADDRESS: " + address + '\n' + "PPS NUMBER: " + ppsNo;
	}

	/**
	 * Prints the details of this person to the screen
	 */
  	public void showPerson() {
		System.out.println("*****PERSONAL DETAILS*****");
		System.out.println("NAME: "+ name);
		System.out.println("ADDRESS: "+ address);
		System.out.println("PPS NUMBER: "+ ppsNo);
	}
}