package behavioral.state;

public class ErrorState implements State{


	@Override
	public View makeView() {
		return  new View("An error occured  message + retry mechanism");
	}

}
