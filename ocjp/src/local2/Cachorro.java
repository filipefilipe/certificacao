package local2;

import local1.Animal;

public class Cachorro extends Animal {

	private Raca raca;
	public String tamnho;

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public void imprimeraca() {
		System.out.println("A ra�a �:" + raca.name());
		System.out.println("A nomeclatura �:" + raca.getNomeclatura());
		System.out.println("O porte �:" + raca.getPorte());
	}

	public void latir() {
		System.out.println("Au! Au!");
	}

	public void comerRacao() {
		System.out.println("Por ra��o!");
		comer();
	}

	@Override
	public void respirar() {
		System.out.println("Respirando");

	}

}

enum Raca {

	RUSK("Husky Siberiano", "Grande"), CHIUAUA("Chiuaua", "Pequeno"), PUDLE("Poodle", "M�dio"), BULLDOG("Bulldog","M�dio"), PUG("Pug", "Pequeno");

	private String nomeclatura;
	private String porte;

	Raca(String nomeclatura, String porte) {
		this.nomeclatura = nomeclatura;
		this.porte = porte;
	}

	public String getNomeclatura() {
		return nomeclatura;
	}

	public String getPorte() {
		return porte;
	}

}