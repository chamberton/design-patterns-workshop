package creational.factory.method;

public class DestructiveButton implements Button {
	private String actionText =  "";
	private String imageAssetName =  null;

	private static final String TEXT_COLOR = "RED";
	private static final String BACKGROUND_COLOR = "WHITE";
	private static final String TEXT_FONT = "12pts Bold";

	@Override
	public void setActionText(String text) {
		this.actionText = text;
	}

	@Override
	public void onTap() {
		if (actionText.isBlank()) return;
		System.out.println("*******************************");
		System.out.println("Destructive button tapped");
		System.out.println("Text" + actionText);
		if (imageAssetName != null) {
			System.out.println("Icon" + imageAssetName);
		} else {
			System.out.println("Icon not set");
		}
		
		System.out.println("Button text color: " + TEXT_COLOR);
		System.out.println("Button text font: " + TEXT_FONT);
		System.out.println("Button background color width: " + BACKGROUND_COLOR);
		System.out.println("\n");
	}

	@Override
	public void setImage(String imageAssetName) {
		this.imageAssetName = imageAssetName;
	}
}
