package product;

public class MultipleHarvest extends Plant{
	  private int yieldPerDay;
	  private int productPeriodInDay;
	public MultipleHarvest(String name, int seedStock,int price,int yieldPerDay,int productPeriodInDay) {
		super(name, seedStock,price);
		this.yieldPerDay=yieldPerDay;
		this.productPeriodInDay=productPeriodInDay;
	}
	
	public int totalRevenue()
	{
		return yieldPerDay*productPeriodInDay*getPrice();
	}

	public int getProductPeriodInDay() {
		return productPeriodInDay;
	}

	public int getYieldPerDay() {
		return yieldPerDay;
	}

}
