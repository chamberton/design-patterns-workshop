package structural.decorator;

public class BasicPizza implements Pizza {
	
	
	@Override
	public double getCost() {
		return 200;
	}
	
	@Override
	public String getDescription() {
		return "24 cm thick base pizza with our delicious spices and condiments";
	}
	
}
