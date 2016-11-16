package mediator;

public class Main {

	public static void main(String[] args) {
		Chat chat = new Chat();
		
		Participante jose = new Participante("José");
		Participante maria = new Participante("Maria");
		Participante joao = new Participante("João");
		Participante matheus = new Participante("Matheus");
		Participante rafael = new Participante("Rafael");
		
		chat.registrar(jose);
		chat.registrar(maria);
		chat.registrar(joao);
		chat.registrar(matheus);
		chat.registrar(rafael);

		
		jose.enviar("Maria", "Olá, como vai?");
		maria.enviar("José", "Bem, e você?");
		matheus.enviar("Rafael", "Boa tarde");
		joao.enviar("Rafael", "E aí, Rafael");
	}
}
