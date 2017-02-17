package cap2;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {

	public void toca(List<Nota> musica) {

		Player player = new Player();
		StringBuilder musicaEmNotas = new StringBuilder();

		for (Nota nota : musica) {
			musicaEmNotas.append(nota.Simbolo() + " ");
		}

		System.out.println(musicaEmNotas.toString());
		
		player.play(musicaEmNotas.toString());
		
		int tempo = 0;
		for(Nota nota : musica){
			player.delayPlay(tempo += 300, nota.Simbolo());
		}
		
		
	}
}
