package org.andgomes.model;

public class Player {

	private String name;
	private Club club;
	
	public Player(String name, Club club) {
	
		this.name = name;
		this.club = club;
		
	}
	
	public String getName() {
		return name;
	}
	
	public Club getClub() {
		return club;
	}

}
