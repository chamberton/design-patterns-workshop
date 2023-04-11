package creational.factory.abstr;
import creational.factory.*;
import creational.factory.method.Button;

public class BorderButton implements Button {
    private Button button = null;
    private double borderWidth = 1;
	private String borderColor = "Blue";

    BorderButton(Button button, double borderWidth, String borderColor) {
        this.button = button;
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
    }


    @Override
    public void setActionText(String text) {
        button.setActionText(text);
    }

    @Override
    public void setImage(String imageAssetName) {
        button.setImage(imageAssetName);
    }

    @Override
    public void onTap() {
        button.onTap();
		System.out.println("Border width: " + borderWidth);
        System.out.println("Border color: " + borderColor);
    }

}
