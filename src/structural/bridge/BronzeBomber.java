package structural.bridge;

public class BronzeBomber extends AbstractVilain {
     
	public BronzeBomber(Ammunitions ammunitions) {
		super(ammunitions);
	}

	@Override
	public void fireAmmunitions(Position targePosition) {
		System.out.println("------------------------------------------");
		System.out.println("Bronze bomber firing\n");
		directAmmunitions(ammunitions.fire(),targePosition);
	}

}
