package product;


public class Plant {
  private String name;
  private int quantityPlanted;
  private int quantityHarvested;
  private int seedStock;
  private int price;
  // Constructor to initialize plant properties
  public Plant(String name,int seedStock,int price) {
	  this.name=name;
	  this.quantityHarvested=0;
	  this.quantityPlanted=0;
	  this.seedStock=seedStock;
	  this.price=price;
  }
	public String getName() {
		return name;
	}
	public int getQuantityPlanted() {
		return quantityPlanted;
	}
	public int getQuantityHarvested() {
		return quantityHarvested;
	}
	public int getSeedStock()
	{
		return seedStock;
	}
	public void sow(int seedToSow)
	{
		quantityPlanted+=seedToSow;
		seedStock-=seedToSow;
	}
	public void harvest(int unitToCollect)
	{
		quantityHarvested+=unitToCollect;
		quantityPlanted-=unitToCollect;
	}
	public int getPrice() {
		return price;
	}
}
