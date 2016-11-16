package observer;

import java.util.ArrayList;
import java.util.List;

public class Button {
	List<OnClickListener> listener;
	
	public Button() {
		this.listener = new ArrayList<>();
	}
	
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener.add(listener);
	}
	
	
	public void click() {
		this.listener.stream().forEach(i -> i.onClick());
	}
}
