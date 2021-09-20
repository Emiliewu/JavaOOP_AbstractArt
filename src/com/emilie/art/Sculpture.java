package com.emilie.art;

public class Sculpture extends Art{
	private String material;
	
	public Sculpture() {}
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
