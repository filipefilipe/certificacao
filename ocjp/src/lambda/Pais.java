package lambda;

public class Pais {
	
	private String nome;
	private int salario;
	
	public Pais(String nome, int salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
}
