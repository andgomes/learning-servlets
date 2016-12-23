package org.andgomes.model;

public class Player {
	
	private String playerName;
	private String playerClub;	
	
	public Player(String playerName, String playerClub) {
	
		this.playerName = playerName;
		this.playerClub = playerClub;
	
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public String getPlayerClub() {
		return playerClub;
	}

}
