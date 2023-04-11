package creational.factory.method;

public class Main {

	public static void main(String[] args) {
		
		ButtonFactory factory = new ButtonFactory();
		
		Button confirmButton = factory.make(ButtonType.confirm);
		Button destructiveButton = factory.make(ButtonType.detructive);
		Button secondaryButton = factory.make(ButtonType.secondary);
		Button primaryButton = factory.make(ButtonType.primary);
		Button imageButton = factory.make(ButtonType.imageButton);
		

		confirmButton.setActionText("Proceed");
		primaryButton.setActionText("Submit");
		secondaryButton.setActionText("Do it later");
		destructiveButton.setActionText("Delete");
		imageButton.setActionText("Image button");

		primaryButton.onTap();
		confirmButton.onTap();
		destructiveButton.onTap();
		secondaryButton.onTap();
		imageButton.onTap();
	}

}
