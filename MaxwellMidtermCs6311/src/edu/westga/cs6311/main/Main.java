package edu.westga.cs6311.main;

import edu.westga.cs6311.blog.Blog;
import edu.westga.cs6311.post.Post;
import edu.westga.cs6311.author.Author;

/**
 * Midterm CS 6311 - Main class to create objects and call methods in Post, Blog, and Author
 * @author justinmaxwell
 * 
 * @version 9/22/22
 *
 */
public class Main {

	/**
	 * Entry point into the application
	 * @param args - Not Used
	 */
	public static void main(String[] args) {
		Author myAuthor = new Author("Stephen King", "sking@gmail.com", 99, "ga");
		Post myPostOne = new Post("Cooking for Newbies", 12, "09/23/22", new Author("John Doe", "jdoe@gmail.com", 67, "ny"));
		Post myPostTwo = new Post("Everything to Know About Star Wars", 32, "05/23/20", new Author("Jane Doe", "jdoe2@gmail.com", 62, "fl"));
		Blog myBlogSite = new Blog("My Blog One", "www.myblogone.com", myPostOne, myPostTwo);
		
		System.out.print(myBlogSite.getBlogDetails());
		
		myBlogSite.setPostOne(new Post("Learn Java 101", 60, "01/12/20", myAuthor));
		myBlogSite.setPostTwo(new Post("Top Rated 2021 Hiking Trails", 2, "12/30/21", myAuthor));
		
		System.out.print(myBlogSite.getBlogDetails());
	}

}
