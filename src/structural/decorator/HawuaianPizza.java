package structural.decorator;

public class HawuaianPizza implements Pizza {
	final static double HAM_PRICE_PER_KG = 70.0;
	final static double PINNEAPLE_SLICES_PER_KG = 20.0;

	protected Pizza pizza;

	private double hamQuantityKg = 0.0;
	private double pinneapleSlicesKg = 0.0;

	public HawuaianPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	

	public void setToppings(double hamQuantityKg, double pinneapleSlicesKg) {
		assert(hamQuantityKg > 0); // Ham quantity must be greater than 0
		assert(pinneapleSlicesKg > 0); // Pinneaple quantity must be greater than 0
		this.hamQuantityKg = hamQuantityKg;
		this.pinneapleSlicesKg = pinneapleSlicesKg;
	}

	private double calculateToppingsCost() {
		return HAM_PRICE_PER_KG*hamQuantityKg + pinneapleSlicesKg*PINNEAPLE_SLICES_PER_KG;
	}

	private String buildDescription() {
		if (hamQuantityKg <= 0 || pinneapleSlicesKg <= 0) {
			return "";
		}
		return String.format(", with\n%,.2f Kg Ham  and .%,.2fkg pinneaple slices", hamQuantityKg, pinneapleSlicesKg);    
	}

	@Override
	public double getCost() {
		return pizza.getCost() + calculateToppingsCost();
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + buildDescription();
	}	
}
