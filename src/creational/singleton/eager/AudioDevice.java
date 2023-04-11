package creational.singleton.eager;

import java.util.List;

public class AudioDevice {

	public static AudioDevice audioDevice = new AudioDevice(); // Early initialization might slow start up time (CONSIDER This if the initilzation is light weight)
	private double volume = 5.0;
	private double speed = 1.0;
	
	private AudioDevice(){
		System.out.println("Singleton created");
	}
	
	public static AudioDevice getInstance() {
		return audioDevice;
	}

	public static String getMake() {
		return "BOSCH - EAGER";
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
		System.out.println(" Playing bytes at volume level" + volume + ", at speed of "+ speed);
	}
}
