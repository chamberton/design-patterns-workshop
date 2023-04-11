package behavioral.state;

public class ViewCanvas {

	private State dataState;

	
	public ViewCanvas() {
		dataState = new Loading();
	}
	
	public void draw(){
		System.out.println("Canvas current shpwing this view:");
		var view = dataState.makeView();
		view.draw();
		System.out.println("");
	}
	
	public void setState(State state){
		dataState = state;
	}
	
	public State getState(){
		return dataState;
	}
}
