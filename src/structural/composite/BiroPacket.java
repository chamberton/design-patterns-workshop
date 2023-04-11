package structural.composite;

// THE Leaf 
// ONE OF THE LEAVES
class BiroPacket implements StoreItem
{
	private String name;
	private String brandName;
	private double weight;
	private long quantity;
	private String inkColor;
	private long itemId;

	public BiroPacket(long itemId, String name, String brandName, double weight, long quantity, String inkColor)
	{
		this.itemId = itemId;
		this.name = name;
		this.brandName = brandName;
		this.weight = weight;
		this.quantity = quantity;
		this.inkColor  = inkColor;
	}
	
	@Override
	public void showDetails()
	{
		System.out.println(  "\n*******************************************\n" + name + "\n" + quantity + " pens, color: " + inkColor  + "\nBrand: " + brandName + "\nItem numbe: " + itemId );
	}

	@Override
	public double getWeight() {
		return weight;
	}
}

