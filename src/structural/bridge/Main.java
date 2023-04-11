package structural.bridge;

public class Main {

	public static void main(String[] args) {
		
		var bronzeBomber = new BronzeBomber(new Lazer());
		var styleBender = new StyleBender(new HotWater());

		styleBender.fireAmmunitions(new Position(100, 10, 20));
		bronzeBomber.fireAmmunitions(new Position(100, 10, 20));
	}

}
