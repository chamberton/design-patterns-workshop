// FROM https://www.geeksforgeeks.org/composite-design-pattern/
package structural.composite;

// CLIENT

public class Main {
    static final private ItemIdGenerator idGenerator = ItemIdGenerator.getInstance();
	public static void main(String[] args) {

		var sugarBag1 = new SugarBag(
			idGenerator.getNext(),
			"Golden Sugar",
			2, 
			"Selati", 
			false,
			"Fine grained sugar"
		);

		var sugarBag2 = new SugarBag(
			idGenerator.getNext(),
			"Light Sugar",
			2, 
			"Selati", 
			true,
			"Very light sugar, low calories"
		);
		var mealieMeal = new MealieMeal(idGenerator.getNext(), "White maize meal", "Iwisa", 12.5,  true);

		var foodDepartement = new StoreDepartment();
		foodDepartement.addItem(sugarBag1);
		foodDepartement.addItem(sugarBag2);
		foodDepartement.addItem(mealieMeal);
		
								
		var paperBox = new PaperPox(idGenerator.getNext(), "A4 paper brand  80gsm", "Rotatrim", 3, 200, "A4 Paper");
		var biroPacket = new BiroPacket(idGenerator.getNext(), "Ball point slick biro", "Bic", 1, 24, "Blue");
		
		var stationanaryDepartement = new StoreDepartment();
		stationanaryDepartement.addItem(biroPacket);
		stationanaryDepartement.addItem(paperBox);
	
		var inventory = new StoreDepartment();
		inventory.addItem(stationanaryDepartement);
		inventory.addItem(foodDepartement);

		System.out.println("----------------------------------------" );
		System.out.println("|                INVETORY              |" );
		System.out.println("----------------------------------------" );
		inventory.showDetails();

		System.out.println("----------------------------------------" );
		System.out.println("|               WEIGHT                 |" );
		System.out.println("----------------------------------------" );
		System.out.println("NET WEIGHT WEIGHT (KG):" + inventory.getWeight() + "Kg");
		
	}

}
