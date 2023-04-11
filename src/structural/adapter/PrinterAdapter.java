package structural.adapter;

public class PrinterAdapter implements ModernPrinter {

	private final Printer printer;
	
	public PrinterAdapter(Printer printer){
		this.printer  = printer;
	}


	@Override
	public void print(int red, int green, int blue, String text) {
		printer.print(text);
	}
}
