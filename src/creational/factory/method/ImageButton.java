package creational.factory.method;

public class ImageButton implements Button {
    private String imageAssetName = null;
	final private static double WIDTH = 100.0;
	final private static double HEIGHT = 100.0;
	

	@Override
	public void setActionText(String text) {
		System.out.println("This button does not accept text " );
	}

	@Override
	public void setImage(String imageAssetName) {
		this.imageAssetName = imageAssetName;
	}

	@Override
	public void onTap() {
		if (imageAssetName == null) return;
		System.out.println("*******************************");
		System.out.println("ImageButton button" );
		System.out.println("Icon" + imageAssetName);
		System.out.println("Icon size" + WIDTH + " by " + HEIGHT);
		System.out.println("\n");
	}

}