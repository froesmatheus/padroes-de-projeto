package builder;

public class App {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Jos�", "Silva", null, null, null, null, null, null);
		
		Pessoa pessoa2 = new Pessoa.Builder()
				.setNome("Jos�")
				.setSobrenome("Silva")
				.build();
		
		
	}
}
