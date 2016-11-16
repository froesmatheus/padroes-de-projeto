package decorator;

public class Filme extends Item {
	private String diretor;
	private String titulo;
	private int duracao;
	
	public Filme(String diretor, String titulo, int duracao, int numCopias) {
		super();
		this.diretor = diretor;
		this.titulo = titulo;
		this.duracao = duracao;
		this.numCopias = numCopias;
	}

	@Override
	public String toString() {
		return 	"\nFilme ---------------" +
				"\nDiretor: " + diretor +
				"\nTítulo: " + titulo +
				"\nDuração: " + duracao;
	}
	
}
