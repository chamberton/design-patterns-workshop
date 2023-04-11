package creational.singleton.eager;


public class Main {

	public static void main(String[] args) {
		
		// Implementation for singleton by instantiating object eagerly.
		// The singleton creation is thread safe
		// It uses eager instantiation; instantiate object as soon as the class is loaded by the JVM
		// Pitfalls are:
			// What if the object won�t be always needed?, 
			// What if the object is very heavy and complex, hence it will slow down the system?
		
		// System.out.println("****************************************");
		
		System.out.println("---> Audio device make: "+ AudioDevice.getMake());
		System.out.println("---> Getting audio device instance to play audio now");

		var audioDevice = AudioDevice.getInstance();
		
		audioDevice.play(null, 10, 2);

		audioDevice.play(null, 11, 8);

	}

}
