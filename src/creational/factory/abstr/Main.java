package creational.factory.abstr;

import creational.factory.method.Button;
import creational.factory.method.ButtonType;


public class Main {

	public static void main(String[] args) {
		var borderlessButtonFactory = ButtonFactoryProducer.getFactory(false);
		var borderedButtonfactory = ButtonFactoryProducer.getFactory(true);
		
		Button confirmButton = borderlessButtonFactory.make(ButtonType.confirm);
		Button borderedConfirmButton = borderedButtonfactory.make(ButtonType.confirm);

		Button destructiveButton = borderlessButtonFactory.make(ButtonType.detructive);
		Button borderedDestructiveButton = borderedButtonfactory.make(ButtonType.secondary);

		Button primaryButton = borderlessButtonFactory.make(ButtonType.primary);
		Button borderedPrimaryButton = borderedButtonfactory.make(ButtonType.imageButton);
		

		confirmButton.setActionText("Proceed");
		borderedConfirmButton.setActionText("Proceed");

		primaryButton.setActionText("Submit");
		borderedPrimaryButton.setActionText("Submit");

		destructiveButton.setActionText("Delete");
		borderedDestructiveButton.setActionText("Delete");

		primaryButton.onTap();
		borderedPrimaryButton.onTap();
		
		confirmButton.onTap();
		borderedConfirmButton.onTap();

		destructiveButton.onTap();
		borderedDestructiveButton.onTap();
	}

}
