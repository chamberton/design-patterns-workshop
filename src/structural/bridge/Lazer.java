package structural.bridge;

public class Lazer implements Ammunitions {
	
    private static int POWER_PER_BEAM = 2*Constants.KILO_MULTIPLER; //2KW

	@Override
	public int fire() {
		System.out.println(String.format("Now firing %dKW lazer beam", POWER_PER_BEAM/Constants.KILO_MULTIPLER));
		return POWER_PER_BEAM; // 1L per shot
	}

}
