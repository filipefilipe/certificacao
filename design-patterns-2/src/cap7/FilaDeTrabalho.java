package cap7;

import java.util.ArrayList;
import java.util.List;

public class FilaDeTrabalho {

	private List<Comando> comandos;

	public FilaDeTrabalho() {
		comandos = new ArrayList<Comando>();
	}

	public void adicionar(Comando comando) {
		this.comandos.add(comando);
	}

	public void processa() {

		for (Comando comnando : comandos) {
			comnando.executa();
		}
	}

}
