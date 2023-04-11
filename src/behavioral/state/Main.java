package behavioral.state;

public class Main {

	public static void main(String[] args) {
		
		var canvas = new ViewCanvas();

		canvas.setState(new Loading());
		canvas.draw();

		canvas.setState(new ErrorState());
		canvas.draw();

		canvas.setState(new Loaded());
		canvas.draw();
	}

}
