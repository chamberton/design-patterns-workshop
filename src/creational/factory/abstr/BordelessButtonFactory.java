package creational.factory.abstr;

import creational.factory.*;
import creational.factory.method.Button;
import creational.factory.method.ButtonFactory;
import creational.factory.method.ButtonType;

public class BordelessButtonFactory extends AbstractButtonFactory {
	final private ButtonFactory buttonFactory = new ButtonFactory();
	

	
	@Override
	public Button make(ButtonType type) {
		return buttonFactory.make(type);
	}
	
}
