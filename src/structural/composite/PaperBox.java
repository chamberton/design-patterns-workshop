package structural.composite;

// THE Leaf 
// ONE OF THE LEAVES
class PaperPox implements StoreItem
{
	private String name;
	private String brandName;
	private double weight;
	private long quantity;
	private String sizeDescription;
	private long itemId;

	public PaperPox(long itemId, String name, String brandName, double weight, long quantity, String sizeDescription)
	{
		this.itemId = itemId;
		this.brandName = brandName;
		this.name = name;
		this.weight = weight;
		this.quantity = quantity;
		this.sizeDescription  = sizeDescription;
	}
	

	@Override
	public void showDetails()
	{
		System.out.println( "\n******************************************\n" + name + "\nSize " + sizeDescription + ", " + quantity + "sheets" + "\nBrand: " + brandName + "\nItem number: " + itemId );
	}

	@Override
	public double getWeight() {
		return weight;
	}
}

