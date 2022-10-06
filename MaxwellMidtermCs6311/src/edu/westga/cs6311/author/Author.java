package edu.westga.cs6311.author;

/**
 * Midterm CS 6311 - Blueprint to create objects and call methods in Author class
 * @author justinmaxwell
 * 
 * @version 9/22/22
 *
 */
public class Author {
	private String name;
	private String email;
	private int phoneNumber;
	private int age;
	private String state;
	
	/**
	 * 0 parameter constructor
	 */
	public Author() {
		
	}
	
	/**
	 * Constructor for Author with Parameters
	 * @param authName initializes name
	 * @param authEmail initializes email
	 * @param authAge initializes age
	 * @param authState initializes state
	 */
	public Author(String authName, String authEmail, int authAge, String authState) {
		this.name = authName;
		this.email = authEmail;
		this.age = authAge;
		this.phoneNumber = 1015021011;
		this.state = authState.toUpperCase();
	}
	
	/**
	 * Getter for name
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Setter for name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for email
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * Setter for email
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Getter for phoneNumber
	 * @return the phoneNumber
	 */
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	
	/**
	 * Setter for phoneNumber
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Getter for age
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Setter for age
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Getter for state
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * Setter for state
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Private method to convert int to string then format the input phone number to (***)-***-****
	 * @return phoneNumber formatted as a string
	 */
	private String formatAuthorPhoneNumber() {
		String input = Integer.toString(this.getPhoneNumber());
		String output = "(" + input.substring(0, 3) + ")-" + input.substring(3, 6) + "-" + input.substring(6, 10);
		return output;
	}
	
	/**
	 * Public method to return details about the Author
	 * @return details of Author
	 */
	public String getAuthorDetails() {
		return "Author's Name: " + this.getName() + ", Email: " + this.getEmail() + ", Phone number: " + this.formatAuthorPhoneNumber() + ", Age: " + this.getAge();
	}
}
