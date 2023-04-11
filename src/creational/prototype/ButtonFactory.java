package creational.prototype;

import java.util.HashMap;
import java.util.Map;

enum ButtonType {
	FLAT, RAISED, OUTLINED
}

public class ButtonFactory {


	private static Map<ButtonType, Button> productsRegistry = new HashMap<ButtonType, Button>();

	public static Button getProduct(ButtonType type) {
		Button initiallyBuiltProduct = productsRegistry.get(type);
		if (initiallyBuiltProduct == null) {
			// there should ideally be a fallback  a way of creating of a button given type, 
		}
		return (Button) initiallyBuiltProduct.clone();
	}
	
	public static void buildRegistry() {
		var flatButton	= new FlatButton();
		var raisedButton = new RaisedButton();
		var outlinedButton = new OutlinedButton();
		
		productsRegistry.put(flatButton.getType(), flatButton);
		productsRegistry.put(raisedButton.getType(), raisedButton);
		productsRegistry.put(outlinedButton.getType(), outlinedButton);
	}
}
