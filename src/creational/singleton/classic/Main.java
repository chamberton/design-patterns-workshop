package creational.singleton.classic;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("---> Audio device make: "+ AudioDevice.getMake());
		System.out.println("---> Getting audio device instance to play audio now");

		// Implementation for singleton by instantiating on the first demand.
		// The singleton creation is not thread safe
		AudioDevice audioDevice = AudioDevice.getInstance();

		System.out.println("--> First demand of playing audio");
		audioDevice.play(null, 10, 2);

		System.out.println("---> Second demand of playing audio ");
		audioDevice.play(null, 11, 8);

	}

}
