package creational.factory.method;

public class ConfirmButton implements Button {

	private String actionText =  "";
	private static final String TEXT_COLOR = "DARK GREY";
	private static final String TEXT_FONT = "12pts Bold";

	@Override
	public void setActionText(String text) {
		this.actionText = text;
	}

	@Override
	public void onTap() {
		if (actionText.isBlank()) return;
		System.out.println("*******************************");
		System.out.println("Confirm button tapped");
		System.out.println("Text" + actionText);
		System.out.println("Button text color: " + TEXT_COLOR);
		System.out.println("Button text font: " + TEXT_FONT);
		System.out.println("\n");
	}

	@Override
	public void setImage(String imageAssetName) {
		System.out.println("This button does not accept icons " );
	}

}
