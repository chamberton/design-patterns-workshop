package structural.decorator;

public class TikkaChickenPizza implements Pizza {
	final static double CHICKEN_CRUMS_PRICE_PER_KG = 40.0;
	final static double TIKKA_SPICE_MIXTURE_PER_KG = 10.0;

	protected Pizza pizza;
	private double chickenCrumbsKg = 0.0;
	private double tikkaMixtureQuantityKg = 0.0;
	
	public TikkaChickenPizza(Pizza pizza){
		this.pizza = pizza;
	}
	

	public void setToppings(double chickenCrumbsKg, double tikkaMixtureQuantityKg) {
		this.chickenCrumbsKg = chickenCrumbsKg;
		this.tikkaMixtureQuantityKg = tikkaMixtureQuantityKg;
	}

	private double calculateToppingsCost() {
		return CHICKEN_CRUMS_PRICE_PER_KG*chickenCrumbsKg + tikkaMixtureQuantityKg*TIKKA_SPICE_MIXTURE_PER_KG;
	}

	private String buildDescription() {
		if (chickenCrumbsKg <= 0 || tikkaMixtureQuantityKg <= 0) {
			return "";
		}
		return String.format(", with\nTikka sauce and %,.2f Kg chicken", chickenCrumbsKg);
	}

	// mark - Pizza

	@Override
	public String getDescription() {
		return pizza.getDescription() + buildDescription();
	}

	@Override
	public double getCost() {
		return pizza.getCost() + calculateToppingsCost();
	}

}
