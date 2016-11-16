package observer;

public class OutraClasse implements OnClickListener {

	
	
	public void fazAlgumaCoisa() {
		
		
		System.out.println("fez alguma coisa");
	}

	@Override
	public void onClick() {
		fazAlgumaCoisa();
	}
}
