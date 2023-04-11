package behavioral.state;

public class Loaded implements State {

	@Override
	public View makeView() {
	    return new View("Data shown");
	}

}
