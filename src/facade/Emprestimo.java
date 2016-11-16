package facade;

public class Emprestimo {
	
	public boolean naoTemEmprestimosAtrasados(Cliente cliente) {
		System.out.println("Checar emprestimos do cliente: " + cliente.getNome());
		return true;
	}
}
