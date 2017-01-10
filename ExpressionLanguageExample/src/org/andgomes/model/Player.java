package org.andgomes.model;

public class Player {

	private String name;
	private Club club;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setClub(Club club) {
		this.club = club;
	}
	
	public String getName() {
		return name;
	}
	
	public Club getClub() {
		return club;
	}

}
