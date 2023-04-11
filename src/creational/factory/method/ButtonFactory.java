package creational.factory.method;

public class ButtonFactory {

	public Button make(ButtonType type) {
		switch(type) {
			case confirm:
				return new ConfirmButton();
			case detructive:
				return new DestructiveButton();
			case secondary:
				return new SecondaryButton();
			case imageButton:
				return new ImageButton();
			default:
				return new PrimaryButton();
		}
	}

}
