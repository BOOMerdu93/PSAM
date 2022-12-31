package product;

public class SingleHarvest extends Plant {
	public SingleHarvest(String name, int seedStock, int price) {
		super(name, seedStock,price);
	}
	public int totalRevenue()
	{
		return getPrice()*getQuantityHarvested();
	}
}
