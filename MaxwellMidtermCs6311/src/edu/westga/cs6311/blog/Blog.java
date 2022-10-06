package edu.westga.cs6311.blog;

import edu.westga.cs6311.post.Post;

/**
 * Midterm CS 6311 - Blueprint to create objects and call methods in Blog class
 * @author justinmaxwell
 * 
 * @version 9/22/22
 *
 */
public class Blog {
	private String title;
	private String siteAddress;
	private Post postOne;
	private Post postTwo;
	
	/**
	 * 0 parameter constructor
	 */
	public Blog() {
		
	}
	
	/**
	 * Constructor for Blog with Parameters
	 * @param newTitle initializes title
	 * @param newSiteAddress initializes siteAddress
	 * @param newPostOne initializes postOne
	 * @param newPostTwo initializes postTwo
	 */
	public Blog(String newTitle, String newSiteAddress, Post newPostOne, Post newPostTwo) {
		this.title = newTitle;
		this.siteAddress = newSiteAddress;
		this.postOne = newPostOne;
		this.postTwo = newPostTwo;
	}
	
	/**
	 * Getter for title
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}
	
	/**
	 * Setter for title
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Getter for siteAddress
	 * @return the siteAddress
	 */
	public String getSiteAddress() {
		return this.siteAddress;
	}
	
	/**
	 * Setter for siteAddress
	 * @param siteAddress the siteAddress to set
	 */
	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}
	
	/**
	 * Getter for postOne
	 * @return the postOne
	 */
	public Post getPostOne() {
		return this.postOne;
	}
	
	/**
	 * Setter for postOne
	 * @param postOne the postOne to set
	 */
	public void setPostOne(Post postOne) {
		this.postOne = postOne;
	}
	
	/**
	 * Getter for postTwo
	 * @return the postTwo
	 */
	public Post getPostTwo() {
		return this.postTwo;
	}
	
	/**
	 * Setter for postTwo
	 * @param postTwo the postTwo to set
	 */
	public void setPostTwo(Post postTwo) {
		this.postTwo = postTwo;
	}
	
	/**
	 * Private method to generate random value between 0 and 1 for post value
	 * @return Math.random from Java Math API
	 */
	private double generatePostFactor() {
		return Math.random();
	}
	
	/**
	 * Public method that multiplies the random number generated in generatePostFactor by 2.75 and sets the postValue in the Post class
	 */
	public void generatePostValue() {
		this.postOne.calculatePostValue(this.generatePostFactor());
		this.postTwo.calculatePostValue(this.generatePostFactor());
	}
	
	/**
	 * Public method to return details of blog object which includes postOne and postTwo from Post class
	 * Also calling generatePostValue for postOne and postTwo
	 * @return postOne and postTwo details
	 */
	public String getBlogDetails() {
		this.generatePostValue();
		return "\n" + this.postOne.getPostDetails() + "\n" + this.postTwo.getPostDetails();
	}
}
