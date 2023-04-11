package creational.prototype;

public class RaisedButton extends Button {

	
	@Override
	public void draw() {
		System.out.println("^^^^^^^^ Raised drawn ^^^^^^^^");
	}

	@Override
	ButtonType getType() {
		return ButtonType.RAISED;
	}
}
