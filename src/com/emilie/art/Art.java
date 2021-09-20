package com.emilie.art;

public abstract class Art {
	private String title;
	private String author;
	private String description;
	
	public Art() {}
	
	public Art(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	public void viewArt() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Description: " + this.description);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
