package decorator;

public class Livro extends Item {
	private String autor, titulo;
	
	public Livro(String autor, String titulo, int numCopias) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.numCopias = numCopias;
	}

	
	@Override
	public String toString() {
		return 	"\nLivro ---------------" +
				"\nAutor: " + autor +
				"\nTítulo: " + titulo;
	}
	
}
