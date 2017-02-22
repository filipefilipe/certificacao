package lambda;

public class TipSelecaoSalario implements TipSelecao<Pais> {

	@Override
	public boolean selecao(Pais p) {
		if (p.getSalario() > 2000)
			return true;

		return false;
	}

}
