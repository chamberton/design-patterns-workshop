package behavioral.observer;

public class ActivityTracker implements WorkerObserver {

	@Override
	public void accept(WokerStatus status, Object data) {
		System.out.println(this.toString() + "Received status update to: " + status.toString());
	}
	
}
