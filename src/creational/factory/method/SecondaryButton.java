package creational.factory.method;

public class SecondaryButton implements Button {
	private String actionText =  "";

	private static final String TEXT_COLOR = "Black";
	private static final String BACKGROUND_COLOR = "WHITE";
	private static final String TEXT_FONT = "12pts Light";

	@Override
	public void setActionText(String text) {
		this.actionText = text;
	}

	@Override
	public void onTap() {
		if (actionText.isBlank()) return;
		System.out.println("*******************************");
		System.out.println("Secondary button tapped");
		System.out.println("Button text color: " + TEXT_COLOR);
		System.out.println("Button text font: " + TEXT_FONT);
		System.out.println("Button background color width: " + BACKGROUND_COLOR);
		System.out.println("\n");
	}

	@Override
	public void setImage(String imageAssetName) {
		
	}
}
