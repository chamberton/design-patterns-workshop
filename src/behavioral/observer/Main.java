package behavioral.observer;

public class Main {

	public static void main(String[] args) {
		
		// Create a worker 
		var documentDownloader = new DocumentDownloader();
		
		// add subsribers
		documentDownloader.addObserver("activiy_tracker", new ActivityTracker());
		documentDownloader.addObserver("resource_manager", new ResourcesManager());
		
		// start an operation, subscribers will be notified at of the various phases of the work
		documentDownloader.loadContent();
		
	}

}
