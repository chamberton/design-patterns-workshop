package structural.bridge;

public class HotWater implements Ammunitions {
    private static int VOLUME_PER_SHOT = 10;

	@Override
	public int fire() {
		System.out.println(String.format("Now firing load of %d hot water ", VOLUME_PER_SHOT));
		return VOLUME_PER_SHOT; // 1L per shot
	}
}