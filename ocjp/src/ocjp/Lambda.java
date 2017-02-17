package ocjp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {

	static Calcula<Integer> calcula = (a,b,c) -> a + b > c ? "Sim" : "Não";
	static Predicate<String> p = s -> s.length() > 2;
	
	public static void main(String[] args) {

		List<Aluno> alunos = Arrays.asList(new Aluno("Filipe", "999999", 27), 
				new Aluno("Luiza", "999999991", 17),
				new Aluno("Beltrano", "9999", 20));

		Filtrar filtrar = new Filtrar();
		
		List<Aluno> alunosFiltrados = filtrar.filtrar(alunos, (a, s) -> a.getNome().equals("Filipe") && a.getFone().equals(s), "999999");
		
		System.out.println(calcula.calcula(2, 3, 4));
		
		System.out.println(alunosFiltrados);
		
		System.out.println(p.test(alunos.get(0).getNome()));

	}

}
