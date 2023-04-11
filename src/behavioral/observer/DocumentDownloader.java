package behavioral.observer;

import java.util.HashMap;


public class DocumentDownloader {
	class Content {

	}
	private WokerStatus status;
    private HashMap<String, WorkerObserver> observersByKey = new HashMap<String, WorkerObserver>();
	private Content data;

	public DocumentDownloader(){
		status = WokerStatus.IDLE;
	}
	
	private void notifyObservers() {
		observersByKey.values().parallelStream().forEach(observer -> {
			observer.accept(status, data);
		});
	}
	
	public void addObserver(String name, WorkerObserver observer) {
		observersByKey.put(name, observer);
		observer.accept(status, data);
	}
	
	public void stopLoading(){
		status = WokerStatus.ABORTED;
		notifyObservers();
	}
	
	public void loadContent() {
		status = WokerStatus.LOADING;
		notifyObservers();
		this.data = new Content(); // some content retrieved
		status = WokerStatus.LOADED;
		notifyObservers();
		
		status = WokerStatus.IDLE;
		notifyObservers();
		
	}
}
