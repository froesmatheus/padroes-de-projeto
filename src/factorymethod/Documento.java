package factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Documento {
	protected List<Pagina> paginas;
	
	public Documento() {
		paginas = new ArrayList<>();
		this.criarPaginas();
	}

	public List<Pagina> getPaginas() {
		return this.paginas;
	}
	
	public abstract void criarPaginas();
}
