package creational.factory.abstr;

import creational.factory.method.Button;
import creational.factory.method.ButtonFactory;
import creational.factory.method.ButtonType;

public class BorderedButtonFactory extends AbstractButtonFactory {
    final private ButtonFactory buttonFactory = new ButtonFactory();

    private BorderButton addBorder(Button button) {
        return new BorderButton(button, 2, "Red");
	}

	@Override
	public Button make(ButtonType type) {
		final var button = buttonFactory.make(type);
        return addBorder(button);
	}
}
