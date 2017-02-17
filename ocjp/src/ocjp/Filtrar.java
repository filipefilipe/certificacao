package ocjp;

import java.util.ArrayList;
import java.util.List;

public class Filtrar {

	public List<Aluno> filtrar(List<Aluno> alunos, Filtro<Aluno, String> f, String s) {

		List<Aluno> retorno = new ArrayList<Aluno>();

		for (Aluno a : alunos) {
			if (f.filtrando(a, s))
				retorno.add(a);
		}

		return retorno;
	}

}
