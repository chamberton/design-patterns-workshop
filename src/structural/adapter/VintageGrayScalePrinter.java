package structural.adapter;

public class VintageGrayScalePrinter implements Printer {

	@Override
	public void print(String text) {
		System.out.println(text);
	}
}
