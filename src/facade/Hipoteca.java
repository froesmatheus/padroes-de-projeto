package facade;

public class Hipoteca {
	private Banco banco;
	private Emprestimo emprestimo;
	private Credora credora;
	
	public Hipoteca() {
		banco = new Banco();
		emprestimo = new Emprestimo();
		credora = new Credora();
	}
	
	public boolean ehElegivel(Cliente cliente, int quantia) {
		boolean elegivel = true;
		
		if (!banco.temDinheiroSuficiente(cliente, quantia)) {
			elegivel = false;
		}
		
		if (!emprestimo.naoTemEmprestimosAtrasados(cliente)) {
			elegivel = false;
		}
		
		if (!credora.temBomCredito(cliente)) {
			elegivel = false;
		}
		
		return elegivel;
	}
}
