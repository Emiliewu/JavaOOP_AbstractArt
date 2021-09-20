package com.emilie.art;

import java.util.ArrayList;

public class Museum {
	public static void main(String[] args) {
		//Create 3 instances of Painting
		Painting p1 = new Painting("Bridge over a Pool of Water Lilies", "Monet", "Impressionist", "Oil on Canvas");
		Painting p2 = new Painting("The Artist's Garden at Giverny", "Monet", "Impressionist", "Oil on Canvas");
		Painting p3 = new Painting(" The Starry Night", "Van Gogh", "Post-Impressionist", "Oil on canvas");
		//		Create 2 instances of Sculpture
		Sculpture s1 = new Sculpture("The Thinker", "Rodin", "Le Penseur", "Bronze");
		Sculpture s2 = new Sculpture("VENUS DE MILO", "Alexandros of Antioch", "ancient Greek sculpture", "Marble");
		
		//Ninja Bonus: store the paintings and sculptures inside of an ArrayList called museum
		ArrayList<Art> museum = new ArrayList<Art>();
		museum.add(p1);
		museum.add(p2);
		museum.add(p3);
		museum.add(s1);
		museum.add(s2);
		for(Art a: museum) {
			a.viewArt();
		}
	}
}
