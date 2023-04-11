package behavioral.state;

public class Loading implements State {

	@Override
	public View makeView() {
			return new View("Loading indicator ......");
	}

}
