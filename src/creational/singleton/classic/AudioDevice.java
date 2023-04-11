package creational.singleton.classic;

import java.util.List;

public class AudioDevice {

	private static AudioDevice audioDevice = null;
	private double volume = 5.0;
	private double speed = 1.0;

	private AudioDevice(){
		System.out.println("Singleton created");
	}
	
	public static AudioDevice getInstance(){
		if(audioDevice == null){
			System.out.println(" Classic Singleton, NOT THREAD SAFE");
			audioDevice = new AudioDevice(); // Intialization happens on the first demand, can be achieve with lazy initialization features if the language allows for it
		}
		return audioDevice;
	}

	public static String getMake() {
		return "BOSCH - CLASSIC";
	}

	private void adjustVolume(double volume) {
		System.out.println("Adjust volume from" + this.volume + " to "+ volume);
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
