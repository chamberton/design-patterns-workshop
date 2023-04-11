package behavioral.observer;

public class ResourcesManager implements WorkerObserver {

	@Override
	public void accept(WokerStatus status, Object data) {
		System.out.println(this.toString() + "Received status update to: " + status.toString());
	}
	
    
}
