package structural.decorator;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		var pizzas = new ArrayList<Pizza>();
		// Order hot chocolate 
		Pizza basicPizza = new BasicPizza();
		pizzas.add(basicPizza);
		
		// Order an hawuain pizza
		HawuaianPizza hawuaian = new HawuaianPizza(basicPizza);
		hawuaian.setToppings(10.0, 10.0);
		pizzas.add(hawuaian);

		// Order a tikka chicken
		TikkaChickenPizza tikkaChicken = new TikkaChickenPizza(basicPizza);
		tikkaChicken.setToppings(10.0, 10.0);
		pizzas.add(tikkaChicken);

		// Print the bill
		System.out.println("Your Order:");

		for (Pizza pizza: pizzas) {
			System.out.println("****************************");
			System.out.println("Item: " + pizza.getDescription());
			System.out.println("Cost: " + pizza.getCost());
			System.out.println("****************************");
		}
	}

}
