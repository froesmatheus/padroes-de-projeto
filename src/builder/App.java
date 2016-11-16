package builder;

public class App {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("José", "Silva", null, null, null, null, null, null);
		
		Pessoa pessoa2 = new Pessoa.Builder()
				.setNome("José")
				.setSobrenome("Silva")
				.build();
		
		
	}
}
