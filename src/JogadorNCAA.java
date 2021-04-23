import java.time.LocalDate;

public class JogadorNCAA extends Pessoa implements Basquete {

	private Premiacoes premios;
	private static int jogadores;
	
	public JogadorNCAA(String nome, LocalDate dataNascimento, String nacionalidade) {
		super(nome, dataNascimento, nacionalidade);
		this.premios = new Premiacoes();
		JogadorNCAA.jogadores++;
	}
	
	public static int getJogadores() {
		return JogadorNCAA.jogadores;
	}

	@Override
	public void escolhaLiga() {
		this.premios.escolhaLiga();
	}

	@Override
	public void setLiga(String liga) {
		this.premios.setLiga(liga);
	}

	@Override
	public void escolhaDeTime() {
		this.premios.escolhaDeTime();
	}

	@Override
	public void setTime(String time) {
		this.premios.setTime(time);
	}

}
