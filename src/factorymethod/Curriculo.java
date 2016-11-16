package factorymethod;

public class Curriculo extends Documento{

	
	@Override
	public void criarPaginas() {
		this.paginas.add(new PaginaCompetencias());
		this.paginas.add(new PaginaEducacao());
		this.paginas.add(new PaginaExperiencias());
	}
}
