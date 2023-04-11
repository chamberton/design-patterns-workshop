package behavioral.state;

public class View {

	String drawing;
	
	public View(String drawing){
		this.drawing = drawing;
	}
	
	public void draw() {
		System.out.println(drawing);
	}


	public void clear() {
		drawing = null;
	}
	
}
