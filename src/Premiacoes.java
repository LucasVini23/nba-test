
public class Premiacoes {

	private String liga;
	private boolean emAtividade;
	private String time;
	
//	public void concorreAoMVP(Pessoa p) {
//		if(p.emAtividade()) {
//			System.out.println("Pode concorrer ao Pr�mio de MVP");
//		}
//		else {
//			System.out.println("Jogador n�o est� em Atividade");
//		}
//	}
	
	public boolean escolhaLiga() {
		if(this.liga == "NBA") {
			System.out.println("� jogador da NBA, e pode concorrer ao premio da NBA");
			return true;
		}
		else {
			System.out.println("N�o � um jogador da NBA, e pode concorrer ao premio da NCAA");
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
			System.out.println("Ele n�o � jogador na NBA");
		}
	}
	
	
}
