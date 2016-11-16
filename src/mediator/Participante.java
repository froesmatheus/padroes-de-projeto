package mediator;

public class Participante {
	private Chat chat;
	private String nome;
	
	public Participante(String nome) {
		this.nome = nome;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void enviar(String para, String mensagem) {
		this.chat.enviar(this.nome, para, mensagem);
	}
	
	public void receber(String de, String mensagem) {
		System.out.println("De " + de + " para " + nome + ": " + mensagem);
	}
}
