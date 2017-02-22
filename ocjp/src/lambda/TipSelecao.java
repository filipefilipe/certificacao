package lambda;

@FunctionalInterface 
interface TipSelecao<T> {

	boolean selecao(T t);
	
}
