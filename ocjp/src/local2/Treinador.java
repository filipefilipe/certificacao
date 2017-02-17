package local2;


public class Treinador {

	public static void main(String[] args) {

	Cachorro cachorro = new Cachorro();
	
	cachorro.nome = "Filepe";
	cachorro.idade = 27;
	cachorro.tamnho = "Grande";
	
	cachorro.setRaca(Raca.RUSK);
	
	cachorro.imprimeraca();
		
	}
}
