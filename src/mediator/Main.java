package mediator;

public class Main {

	public static void main(String[] args) {
		Chat chat = new Chat();
		
		Participante jose = new Participante("Jos�");
		Participante maria = new Participante("Maria");
		Participante joao = new Participante("Jo�o");
		Participante matheus = new Participante("Matheus");
		Participante rafael = new Participante("Rafael");
		
		chat.registrar(jose);
		chat.registrar(maria);
		chat.registrar(joao);
		chat.registrar(matheus);
		chat.registrar(rafael);

		
		jose.enviar("Maria", "Ol�, como vai?");
		maria.enviar("Jos�", "Bem, e voc�?");
		matheus.enviar("Rafael", "Boa tarde");
		joao.enviar("Rafael", "E a�, Rafael");
	}
}
