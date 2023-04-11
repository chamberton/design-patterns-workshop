package structural.composite;

// THE Leaf 
// ONE OF THE LEAVES
class SugarBag implements StoreItem
{
	private String description;
	private String brandName;
	private long itemId;
	private boolean isBrown;
	private String name;
	private double weight;
	
	public SugarBag(long itemId, String name, double weight, String brandName, Boolean isBrown, String description)
	{
		// Assign the Employee id,
		// name and the position
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.isBrown = isBrown;
		this.weight = weight;
		this.description = brandName;
	}


	@Override
	public void showDetails()
	{
		System.out.println( "\n*******************************************\n" + name + "\n" + description + "\n" + (isBrown ? "Brown sugar": "White sugar") + ", " + weight + "Kg" + "\nBrand:" + brandName + "\nItem number" + itemId);
	}
	
	@Override
	public double getWeight() {
		return weight;
	}
}
