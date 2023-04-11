package structural.bridge;

public abstract class AbstractVilain {

	protected Ammunitions ammunitions;
	
	public AbstractVilain(Ammunitions ammunitions){
		this.ammunitions = ammunitions;
	}

	protected void directAmmunitions(int quantity, Position targePosition) {
		System.out.println(String.format("%d ammunitions landed at \n%s", quantity, targePosition.toString()));
		System.out.println("**********************************************");
	}

	public abstract void fireAmmunitions(Position targetLocation);
}
