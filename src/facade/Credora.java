package facade;

public class Credora {
	
	public boolean temBomCredito(Cliente cliente) {
		System.out.println("Checar cr�dito do cliente: " + cliente.getNome());
		return true;
	}
}
