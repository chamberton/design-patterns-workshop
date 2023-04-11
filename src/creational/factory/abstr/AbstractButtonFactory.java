package creational.factory.abstr;

import creational.factory.*;
import creational.factory.method.Button;
import creational.factory.method.ButtonType;

public abstract class AbstractButtonFactory {

	public abstract Button make(ButtonType type);

}