package kata;

public class main {
	public static void main(String[] args) {
		
		Player p1 = new Player("khalil");
		Player p2 = new Player("hammou");
		Part part = new Part(p1, p2);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p1);
		part.winPoint(p2);
		part.winPoint(p1);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		System.out.println(p2.getScoreInSet());
		
	}
	
	

}
