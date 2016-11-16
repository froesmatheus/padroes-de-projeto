package decorator;

public abstract class Decorator extends Item{
	protected Item item;

	public Decorator(Item item) {
		this.item = item;
	}
	
	@Override
	public String toString() {
		return item.toString();
	}
}
