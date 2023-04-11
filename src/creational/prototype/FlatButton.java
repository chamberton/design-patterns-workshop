package creational.prototype;

public class FlatButton extends Button {

	@Override
	public void draw() {
		System.out.println("-------- Raised drawn --------");
	}

	@Override
	ButtonType getType() {
		return ButtonType.FLAT;
	}
}
