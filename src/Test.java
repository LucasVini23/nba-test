import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		JogadorNBA james = new JogadorNBA("Lebron James", LocalDate.of(1984, 12, 30), "Americano");
		james.setEmAtividade(true);
		james.setLiga("NBA");
		james.setTime("Lakers");
		james.escolhaDeTime();
		
		JogadorNBA curry = new JogadorNBA("Stephen Curry", LocalDate.of(1988, 3, 14), "Americano");
		curry.setEmAtividade(true);
		curry.setLiga("NBA");
		curry.setTime("Golden State Warriors");
		curry.escolhaDeTime();
		
		JogadorNBA Harden = new JogadorNBA("James Harden", LocalDate.of(1989, 8, 26), "Americano");
		Harden.setEmAtividade(true);
		Harden.setLiga("NBA");
		Harden.setTime("Brooklyn Nets");
		Harden.escolhaDeTime();
		
		JogadorNCAA Zion  = new JogadorNCAA("Zion Williamson", LocalDate.of(2000, 7, 6), "Americano");
		Harden.setEmAtividade(true);
		Harden.setLiga("NCAA");
		Harden.setTime("New Orleans Pelicans");
		Harden.escolhaDeTime();
		
		JogadorNCAA LaMelo  = new JogadorNCAA("LaMelo Ball", LocalDate.of(2001, 8, 22), "Americano");
		Harden.setEmAtividade(true);
		Harden.setLiga("NCAA");
		Harden.setTime("Charlotte Hornets");
		Harden.escolhaDeTime();
		
		System.out.println("\nJogadores elegiveis para concorrer ao Premio NBA: " + JogadorNBA.getJogadores());
		System.out.println("\nJogadores não elegiveis para concorrer ao Premio NCAA: " + JogadorNCAA.getJogadores());		
	}
	
}
