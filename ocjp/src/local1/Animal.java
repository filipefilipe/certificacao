package local1;

 public abstract class Animal {

	public String nome;
	public int idade;
	int valor;

	protected void comer(){
		System.out.println("Comendo!");
	}
	
	public abstract void respirar();
	
}
