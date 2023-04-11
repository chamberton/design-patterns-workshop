package creational.prototype;

public class Main {

	public static void main(String[] args) {
		
		// load objects
		ButtonFactory.buildRegistry();
		
		// request for flat button, this will not be created by clone from the pre-existing flat button
		var firstButton =  ButtonFactory.getProduct(ButtonType.FLAT);
		
		// request for raised button, this will not be created by clone from the pre-existing raised button
		var secondButton = ButtonFactory.getProduct(ButtonType.RAISED);
		
		// request for outlined button, this will not be created by clone from the pre-existing outlined button
		var thirdButton = ButtonFactory.getProduct(ButtonType.OUTLINED);

		firstButton.draw();
		secondButton.draw();
		thirdButton.draw();
	}

}
