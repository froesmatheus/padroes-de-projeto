package facade;

public class Main {
	public static void main(String[] args) {
		Hipoteca hipoteca = new Hipoteca();
		
		Cliente cliente = new Cliente("Jos� da Silva");
		
		boolean elegivel = hipoteca.ehElegivel(cliente, 125000);
		
		System.out.println("\n� eleg�vel? " + elegivel);
	}
}
