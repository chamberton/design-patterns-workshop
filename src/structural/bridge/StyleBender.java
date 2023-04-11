package structural.bridge;

public class StyleBender extends AbstractVilain {

	public StyleBender(Ammunitions ammunitions) {
		super(ammunitions);
	}

	@Override
	public void fireAmmunitions(Position targetLocation) {
		System.out.println("------------------------------------------");
		System.out.println("Style bender firing\n");
		directAmmunitions(ammunitions.fire(),targetLocation);
	}

}
