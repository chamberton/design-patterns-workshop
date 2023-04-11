package structural.adapter;

public class LazerJetColorPrinter implements ModernPrinter {
    private static String COLOR_PRINTER_SELECTION_MESSSAGE = "********** This will be in color **********";
	private static String COLOR_PRINTER_INK_RESET_MESSAGE = "********** END of color printing **********";

	private void makeColorInk(int red, int green, int blue) {
		System.out.println(COLOR_PRINTER_SELECTION_MESSSAGE );
	}

	private void resetToDefaultInk() {
		System.out.println(COLOR_PRINTER_INK_RESET_MESSAGE );
	}

	@Override
	public void print(int red, int green, int blue, String text) {
		makeColorInk(red, blue, green);
		System.out.println(text);
		resetToDefaultInk();
	}

}
