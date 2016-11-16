package factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Documento> documentos = new ArrayList<>();
		
		documentos.add(new Relatorio());
		documentos.add(new Curriculo());
		
		for(Documento doc : documentos) {
			System.out.println("\n" + doc.getClass().getSimpleName());
			for(Pagina pag : doc.getPaginas()) {
				System.out.println(" " + pag.getClass().getSimpleName());
			}
		}
	}
}
