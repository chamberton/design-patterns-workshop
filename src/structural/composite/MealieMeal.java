package structural.composite;

// THE Leaf 
// ONE OF THE LEAVES
class MealieMeal implements StoreItem
{
	private String name;
	private long itemId;
	private double weight;
	private String brandName;
	private Boolean instantCooking;

	public MealieMeal(long itemId, String name, String brandName, double weight, Boolean instantCooking)
	{
		this.itemId = itemId;
		this.name = name;
		this.brandName = brandName;
		this.weight = weight;
		this.instantCooking = instantCooking;
	}
	
	@Override
	public void showDetails()
	{
		System.out.println("\n*******************************************\n"+ name + (instantCooking ? ", Instant Cooking": ", Non instant cooking") + "\n" + weight + "Kg" + "\nBrand: " + brandName + "\nItem number: " + itemId );
	}
	
	@Override
	public double getWeight() {
		return weight;
	}
}

