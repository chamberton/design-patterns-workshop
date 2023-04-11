package creational.prototype;

public class OutlinedButton extends Button {

	@Override
	public void draw() {
		System.out.println("------------------------------");
		System.out.println("|       Outline drawn        |");
		System.out.println("------------------------------");
	}

	@Override
	ButtonType getType() {
		return ButtonType.OUTLINED;
	}
}
