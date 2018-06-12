package kata;

public class Player {
	private String name;
	private int scoreInPart = 0;
	private int scoreInSet;
	public Player() {		
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public void winPart(){
		this.scoreInSet++;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getScoreInPart() {
		return scoreInPart;
	}

	public void setScoreInPart(int scoreInPart) {
		this.scoreInPart = scoreInPart;
	}

	public int getScoreInSet() {
		return scoreInSet;
	}

	public void setScoreInSet(int scoreInSet) {
		this.scoreInSet = scoreInSet;
	}
	
	
	
	
	
	
	
}
