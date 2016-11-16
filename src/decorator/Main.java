package decorator;

public class Main {

	public static void main(String[] args) {
		Livro livro = new Livro("Paulo Silveira", "Introdução À Arquitetura e Design de Software", 10);
		System.out.println(livro);
		
		Filme filme = new Filme("Martyn Burke", "Piratas do Vale do Silício", 120, 15);
		System.out.println(filme);
		
		Alugavel aluguelFilme = new Alugavel(filme);
		aluguelFilme.alugar("Jorge");
		aluguelFilme.alugar("Maria");
		
		System.out.println(aluguelFilme);
	}

}
