package kata;

import java.util.Date;

public class Part {

	private Player player1;
	private Player player2;
	private Date date;
	
	public Part(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		date = new Date();
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void winPoint(Player p){
		if(p == player1){
			player1.setScoreInPart(player1.getScoreInPart() + 1);
			if(partWinner()){
				player1.winPart();
			}
		} else if(p == player2){
			player2.setScoreInPart(player2.getScoreInPart() + 1);
			if(partWinner()){
				player2.winPart();
			}
		} else {
			System.out.println("This player doesn't exist in this part");
		}
	}

	public String getScore() {

		if (partWinner()) {
			return playerWithHighestScore() + " wins";
		}
		
		if (hasAdvantage()) { 
			return "Advantage " + playerWithHighestScore(); 
		}
		
		if (isDeuce())
			return "Deuce";
		
		
		return translateScore(player1.getScoreInPart()) + " - " + translateScore(player2.getScoreInPart());
	}

	private boolean isDeuce() {
		return player1.getScoreInPart() >= 3 && player2.getScoreInPart() == player1.getScoreInPart();
	}
	
	private String playerWithHighestScore() {
		if (player1.getScoreInPart() > player2.getScoreInPart()) {
			return player1.getName();
		} else {
			return player2.getName();
		}
	}
	
	private boolean partWinner() {
		if(player2.getScoreInPart() >= 4 && player2.getScoreInPart() >= player1.getScoreInPart() + 2 ){
			player1.setScoreInPart(0);
			player2.setScoreInPart(0);
			return true;
		}
		if(player1.getScoreInPart() >= 4 && player1.getScoreInPart() >= player2.getScoreInPart() + 2){
			player1.setScoreInPart(0);
			player2.setScoreInPart(0);
			return true;
		}
		return false;
	}
	
	private boolean hasAdvantage() {
		if (player2.getScoreInPart() >= 3 && player2.getScoreInPart() == player1.getScoreInPart() + 1)
			return true;
		if (player1.getScoreInPart() >= 3 && player1.getScoreInPart() == player2.getScoreInPart() + 1)
			return true;
		
		return false;

	}

	
	
	private String translateScore(int score) {
		switch (score) {
		case 3:
			return "40";
		case 2:
			return "30";
		case 1: 
			return "15";
		case 0:
			return "0";
		}
		throw new IllegalArgumentException("Illegal score: " + score);
	}
}
