package kata;

public class main {
	public static void main(String[] args) {
		
		Player p1 = new Player("joueur1");
		Player p2 = new Player("joueur2");
		Part part = new Part(p1, p2);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p1);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		part.winPoint(p2);
		System.out.println(part.getScore());
		
	}
	
	

}
