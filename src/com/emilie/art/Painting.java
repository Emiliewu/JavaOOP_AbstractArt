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
	
	
}
