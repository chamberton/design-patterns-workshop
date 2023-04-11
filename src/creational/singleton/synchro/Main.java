package creational.singleton.synchro;

public class Main {

	public static void main(String[] args) {
		
		// This implementation relies on the keyword "synchronized",
		// in getInstance() method, So, that it's thread safe.
		// Pitfalls of this method is Synchronization is expensive, 
		// you will pay performance(takes more time) cost every time you call getInstance() method. 

		System.out.println("---> Audio device make: "+ AudioDevice.getMake());
		System.out.println("---> Getting audio device instance to play audio now");
		
		AudioDevice audioDevice = AudioDevice.getInstance();
		
		System.out.println("--> First demand of playing audio");
		audioDevice.play(null, 10, 2);

		System.out.println("---> Second demand of playing audio ");
		audioDevice.play(null, 11, 8);
	}

}
