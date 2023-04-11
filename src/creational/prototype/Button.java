package creational.prototype;

public abstract class Button implements Cloneable {
	
	abstract void draw();
    abstract ButtonType getType();

	@Override
	public Button clone() {
		try {
			return (Button) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
