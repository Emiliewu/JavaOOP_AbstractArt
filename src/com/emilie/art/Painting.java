package com.emilie.art;

public class Painting extends Art {
	
	private String paintType; 
	
	public Painting() {
		
	}
	
	public Painting(String title, String author, String description, String type) {
		super(title, author, description);
		this.paintType = type;
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
	@Override
	public void viewArt() {
		String result = "";
		result += "Title:       " + getTitle() + "\n";
		result += "Author:      " + getAuthor() + "\n";
		result += "Description: " + getDescription() + "\n";
		result += "paintType:   " + paintType + "\n";
		System.out.println(result);
	}
}
