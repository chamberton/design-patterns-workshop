package structural.adapter;

public class Main {

	public static void main(String[] args) {
		
		// print a text in Color
		ModernPrinter printer = new LazerJetColorPrinter();
		System.out.println("\nPrinting with modern printer ----->");
		printer.print(4,5,0, "Hello world");
		
		// since Vintage printer do not support color printer
		// so we need to use the adapter pattern 
		// and PrinterAdapter will adapt the vinatage package so that it accept the command 
		// print with RGB values
		System.out.println("\nPrinting with vintage grayscale printer ----> ");
		ModernPrinter adapterVintagePrinter = new PrinterAdapter(new VintageGrayScalePrinter());
		adapterVintagePrinter.print(4,5,0, "Hello world");
	}

}
