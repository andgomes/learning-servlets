package org.andgomes.model;

public class Player {

	private String name;
	private Club currentClub;
	private Club[] pastClubs;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCurrentClub(Club currentClub) {
		this.currentClub = currentClub;
	}
	
	public void setPastClubs(Club[] pastClubs) {
		this.pastClubs = pastClubs;
	}
	
	public String getName() {
		return name;
	}
	
	public Club getCurrentClub() {
		return currentClub;
	}
	
	public Club[] getPastClubs() {
		return pastClubs;
	}

}
