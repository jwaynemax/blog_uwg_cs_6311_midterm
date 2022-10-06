package edu.westga.cs6311.post;

import edu.westga.cs6311.author.Author;

/**
 * Midterm CS 6311 - Blueprint to create objects and call methods in Post class
 * @author justinmaxwell
 * 
 * @version 9/22/22
 *
 */
public class Post {
	private String title;
	private int length;
	private String datePosted;
	private Author postAuthor;
	private double postValue;
	
	/**
	 * 0 parameter constructor
	 */
	public Post() {
		
	}
	
	/**
	 * Constructor for CondoBuilding with Parameters
	 * @param newTitle initializes title
	 * @param newLength initializes length
	 * @param newDatePosted initializes datePosted
	 * @param newPostAuthor initializes postAuthor
	 */
	public Post(String newTitle, int newLength, String newDatePosted, Author newPostAuthor) {
		this.title = newTitle;
		this.length = newLength;
		this.datePosted = newDatePosted;
		this.postAuthor = newPostAuthor;
		this.postValue = 0.0;
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
	 * Getter for length
	 * @return the length
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * Setter for length
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * Getter for datePosted
	 * @return the dataPosted
	 */
	public String getDatePosted() {
		return this.datePosted;
	}
	
	/**
	 * Setter for datePosted
	 * @param datePosted the dataPosted to set
	 */
	public void setDataPosted(String datePosted) {
		this.datePosted = datePosted;
	}
	
	/**
	 * Getter for postAuthor
	 * @return the postAuthor
	 */
	public Author getPostAuthor() {
		return this.postAuthor;
	}
	
	/**
	 * Setter for postAuthor
	 * @param postAuthor the postAuthor to set
	 */
	public void setPostAuthor(Author postAuthor) {
		this.postAuthor = postAuthor;
	}
	
	/**
	 * Getter for postValue
	 * @return the postValue
	 */
	public double getPostValue() {
		return this.postValue;
	}
	
	/**
	 * Setter for postValue
	 * @param postValue the postValue to set
	 */
	public void setPostValue(double postValue) {
		this.postValue = postValue;
	}
	
	/**
	 * Calculates product of increaseFactor and 2.75 and sets postValue
	 * @param increaseFactor for calculating product with 2.75
	 */
	public void calculatePostValue(double increaseFactor) {
		this.setPostValue(increaseFactor * 2.75);
	}
	
	/**
	 * Public method to return details about the Author and Post Details
	 * @return details of Author and Post
	 */
	public String getPostDetails() {
		return "Post: " + this.getTitle() + ", Length: " + this.getLength() + ", Posted on: " + this.getDatePosted() 
		+ ", Current Value: $" + String.format("%.2f", this.getPostValue())  + "\n" + this.postAuthor.getAuthorDetails();
	}
	
	/**
	 * Calculates reduced price by random percentage
	 * @return reduced price by random percentage
	 */
	public String reducePriceByPercentage() {
		double randomPercentage = Math.random();
		return "$" + String.format("%.2f", this.getPostValue() - (this.getPostValue() * randomPercentage));
	}
}
