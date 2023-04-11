package structural.composite;

import java.util.ArrayList;
import java.util.List;

// THE COMPOSITE
// Class used to get Employee List
// and do the opertions like
// add or remove Employee

class StoreDepartment implements StoreItem
{
	private List<StoreItem> storeItems = new ArrayList<StoreItem>();
	
		
	@Override
	public void showDetails()
	{
		for(StoreItem storeItem:storeItems)
		{
			storeItem.showDetails();
		}
	}

	@Override
	public double getWeight()
	{
		double totalWeight = 0.0;
		for(StoreItem storeItem:storeItems)
		{
			totalWeight += storeItem.getWeight();
		}
		return totalWeight;
	}
		
	public void addItem(StoreItem emp)
	{
		storeItems.add(emp);
	}
		
	public void removeItem(StoreItem emp)
	{
		storeItems.remove(emp);
	}
}
