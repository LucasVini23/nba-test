import java.time.LocalDate;

public abstract class Pessoa {
	
	private String nome;
	private String nacionalidade;
	private LocalDate dataNascimento;
	private boolean emAtividade;
	
	public Pessoa(String nome, LocalDate dataNascimento, String nacionalidade) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.nacionalidade = nacionalidade;
	}

	public boolean emAtividade() {
		if(this.emAtividade) {
			return true;
		}
		else {
			return false;
		}
	}

	public void setEmAtividade(boolean emAtividade) {
		this.emAtividade = emAtividade;
	}
	
}
