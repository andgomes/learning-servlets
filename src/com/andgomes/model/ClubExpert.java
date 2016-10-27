package com.andgomes.model;

public class ClubExpert {

	private String playerName;
	
	public ClubExpert(String playerName) {
		this.playerName = playerName;
	}
	
	public String getClub() {
	
		String clubName = null;
	
		switch (playerName) {
		
			case "Jamie Vardy": clubName = "Leicester City"; break;
			
			case "Wayne Rooney": clubName = "Manchester United"; break;
			
			case "Jordan Henderson": clubName = "Liverpool"; break;
		
		}
		
		return clubName;
	
	}

}
