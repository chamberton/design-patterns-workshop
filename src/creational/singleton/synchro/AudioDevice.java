package creational.singleton.synchro;

import java.util.List;

public class AudioDevice {

	private static AudioDevice audioDevice = null;
	private double volume = 5.0;
	private double speed = 1.0;
	
	
	private AudioDevice(){
		System.out.println("Singleton created");
	}
	
	public static synchronized AudioDevice getInstance(){ // You can use languagae specific synchronization features, remember to apply synchronization on mutating class methods too
		if(audioDevice == null){
			audioDevice = new AudioDevice();
		}
		return audioDevice;
	}

	public static String getMake() {
		return "BOSCH - SYNCHRO";
	}

	private void adjustVolume(double volume) {
		System.out.println("Adjust volume from " + this.volume + " to "+ volume);
		this.volume = volume;
	}
	
	private void adjustSpeed(double speed) {
		System.out.println("Adjusting speed from " + this.speed + " to "+ speed);
		this.speed = speed;
	}
	
	public void play(List<Short> bytes, double volume, double speed){
		adjustSpeed(speed);
		adjustVolume(volume);
		System.out.println(" Playing bytes at volume level " + volume + ", at speed of "+ speed);
	}
}
