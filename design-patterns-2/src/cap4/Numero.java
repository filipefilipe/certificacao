package cap4;

public class Numero implements Expressao {

	private int numero;

	public Numero(int numero) {

		this.numero = numero;
	}

	public int avalia() {
		return numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void aceita(ImpressoraVisitor impressora) {
		impressora.visitaNumero(this);

	}
}
