package mediator;

import java.util.HashMap;

public class Chat {
	private HashMap<String, Participante> participantes;
	
	public Chat() {
		participantes = new HashMap<>();
	}
	
	public void registrar(Participante participante) {
		if (!participantes.containsValue(participante)) {
			participantes.put(participante.getNome(), participante);
		}
		
		participante.setChat(this);
	}
	
	
	public void enviar(String de, String para, String mensagem) {
		Participante participante = participantes.get(para);
		
		if (participante != null) {
			participante.receber(de, mensagem);
		}
	}
	
}
