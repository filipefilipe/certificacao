package cap7;

public class ConcluiPedido implements Comando {

	private Pedido p;

	public ConcluiPedido(Pedido p) {
		this.p = p;
	}

	@Override
	public void executa() {
		System.out.println("concluindo pedido do " + p.getCliente());
		p.finaliza();
	}

}
