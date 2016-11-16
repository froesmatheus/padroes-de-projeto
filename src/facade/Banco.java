package facade;

public class Banco {
	
	
	public boolean temDinheiroSuficiente(Cliente cliente, int quantia) {
		System.out.println("Checar conta no banco do cliente: " + cliente.getNome());
		return true;
	}
}
