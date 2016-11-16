package decorator;

import java.util.ArrayList;
import java.util.List;

public class Alugavel extends Decorator {
	private List<String> locatarios;
	
	public Alugavel(Item item) {
		super(item);
		locatarios = new ArrayList<>();
	}
	
	public void alugar(String nomeLocatario) {
		locatarios.add(nomeLocatario);
		this.item.numCopias--;
	}
	
	public void devolver(String nomeLocatario) {
		locatarios.remove(nomeLocatario);
		this.item.numCopias++;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString() + "\n\n");
		
		for (String locatario : locatarios) {
			builder.append("Locatário: " + locatario);
		}
		
		return builder.toString();
	}
	
}
