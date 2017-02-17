package ocjp;

public class Aluno {

	private String nome;
	private String fone;
	private int idade;

	public Aluno(String nome, String fone, int idade) {
		this.nome = nome;
		this.fone = fone;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
