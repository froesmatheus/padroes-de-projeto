package factorymethod;

public class Relatorio extends Documento {

	@Override
	public void criarPaginas() {
		this.paginas.add(new PaginaIntroducao());
		this.paginas.add(new PaginaResultados());
		this.paginas.add(new PaginaConclusao());
		this.paginas.add(new PaginaResumo());
		this.paginas.add(new PaginaBibliografia());
	}
}
