package lambda;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Pais> p = Arrays.asList(new Pais("Alemanha", 3000), new Pais("Portugal", 1600), new Pais("Espanha", 2100));
		
		Selecionar s = new Selecionar();
		
		TipSelecao<Pais> tipSelecao  = pais -> pais.getSalario() > 2000;
		
		System.out.println(s.selecao(p, tipSelecao));
		
	}

}
