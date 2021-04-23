
public class Premiacoes {

	private String liga;
	private boolean emAtividade;
	private String time;
	
//	public void concorreAoMVP(Pessoa p) {
//		if(p.emAtividade()) {
//			System.out.println("Pode concorrer ao Prêmio de MVP");
//		}
//		else {
//			System.out.println("Jogador não está em Atividade");
//		}
//	}
	
	public boolean escolhaLiga() {
		if(this.liga == "NBA") {
			System.out.println("É jogador da NBA, e pode concorrer ao premio da NBA");
			return true;
		}
		else {
			System.out.println("Não é um jogador da NBA, e pode concorrer ao premio da NCAA");
			return false;
		}
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}
	
	public void setTime(String time) {
		this.time = time;
	}

	public void escolhaDeTime() {
		System.out.println("");
		if(this.emAtividade || escolhaLiga()) {
			System.out.println("Ele joga no time dos " + this.time);
		}
		else {
			System.out.println("Ele não é jogador na NBA");
		}
	}
	
	
}
