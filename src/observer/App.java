package observer;

public class App {

	public static void main(String[] args) {
		Button button = new Button();
		
		
//		button.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick() {
//				System.out.println("Listener foi chamado!");
//			}
//		});
		

		OutraClasse classe = new OutraClasse();
		OutraClasse classe2 = new OutraClasse();
		
		
		button.setOnClickListener(classe);
		button.setOnClickListener(classe2);
		
		button.click();
	}

}
