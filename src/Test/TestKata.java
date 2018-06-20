package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import kata.Part;
import kata.Player;

public class TestKata {

	Player p1 = new Player("joueur1");
	Player p2 = new Player("joueur2");
	Part part = new Part(p1, p2);
	
	@Test
	public void gameStarts() { // The game starts with a score of 0 point for each player
		String score = part.getScore();
		assertEquals("0 - 0", score);
	}
	
	@Test
	public void playerOneWinAPoint(){
		part.winPoint(p1);
		String score = part.getScore();
		assertEquals("15 - 0", score);
	}
	
	@Test
	public void playerTwoWinAPoint(){
		part.winPoint(p2);
		String score = part.getScore();
		assertEquals("0 - 15", score);
	}
	
	@Test
	public void playerOneWinTwoPoints(){
		part.winPoint(p1);
		part.winPoint(p1);
		String score = part.getScore();
		assertEquals("30 - 0", score);
	}
	
	@Test
	public void playerOneWinThreePoints(){
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		String score = part.getScore();
		assertEquals("40 - 0", score);
	}
	
	@Test
	public void playerOneWins(){
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		String score = part.getScore();
		assertEquals(p1.getName() + " wins", score);
	}
	
	@Test
	public void playerTwoWins(){
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		String score = part.getScore();
		assertEquals(p2.getName() + " wins", score);
	}
	
	@Test
	public void playersDeuce(){
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		String score = part.getScore();
		assertEquals("Deuce", score);
	}
	
	@Test
	public void playerOneAdvantage(){
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p1);
		String score = part.getScore();
		assertEquals("Advantage " + p1.getName(), score);
	}
	
	@Test
	public void playerOneAdvantagedWins(){
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p1);
		part.winPoint(p1);
		String score = part.getScore();
		assertEquals(p1.getName() + " wins", score);
	}
	
	@Test
	public void playerOneAdvantagedlooses(){
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p1);
		part.winPoint(p2);
		String score = part.getScore();
		assertEquals("Deuce", score);
	}
	
	@Test
	public void playerScoreAfterWinningPart(){
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		String score = part.getScore();
		assertEquals(p1.getName() + " wins", score);
		assertEquals(1, p1.getScoreInSet());
	}
	
	@Test
	public void playerOneWinSet(){
		p1.setScoreInSet(5);	
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		String score = part.getScore();
		assertEquals(p1.getName() + " wins", score);
		assertEquals(true, p1.isWinSet());
	}
	
	@Test
	public void playerTwoWinSet(){
		p2.setScoreInSet(5);	
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		String score = part.getScore();
		assertEquals(p2.getName() + " wins", score);
		assertEquals(true, p2.isWinSet());
	}

}
