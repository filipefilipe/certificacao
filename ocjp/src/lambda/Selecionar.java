package lambda;

import java.util.ArrayList;
import java.util.List;

public class Selecionar {

	public List<Pais> selecao(List<Pais> p, TipSelecao<Pais> tipSelecao) {

		List<Pais> pRetorno = new ArrayList<>();

		for (Pais pais : p)
			if (tipSelecao.selecao(pais))
				pRetorno.add(pais);
		return pRetorno;
	}
}
