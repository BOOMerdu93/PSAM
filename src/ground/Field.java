package ground;

import java.util.ArrayList;
import java.util.List;

import product.MultipleHarvest;
import product.Plant;
import product.SingleHarvest;

public class Field {
	  private String name;
	  private int area;
	  private List<SingleHarvest> singleHrv;
	  private List<MultipleHarvest> multipleHrv;

	  public Field(String name, int area) {
	    this.name = name;
	    this.area = area;
	    this.singleHrv = new ArrayList<>();
	    this.multipleHrv = new ArrayList<>();
	  }

	  public void addSingleHarvest(SingleHarvest singleHarvest) {
	    singleHrv.add(singleHarvest);
	  }
	  
	  public void addMultipleHarvest(MultipleHarvest multipleHarvest) {
		    multipleHrv.add(multipleHarvest);
		  }

	  public List<SingleHarvest> getSingleHarvest() {
	    return singleHrv;
	  }
	  
	  public List<MultipleHarvest> getMultipleHarvest() {
		    return multipleHrv;
		  }

	  public int getArea() {
	    return area;
	  }

	  public int getTotalHarvest() {
	    int totalHarvest = 0;
	    for (MultipleHarvest multipleHarvest : multipleHrv) {
	      totalHarvest += multipleHarvest.getQuantityHarvested();
	    }
	    for (SingleHarvest singleHarvest : singleHrv) {
		      totalHarvest += singleHarvest.getQuantityHarvested();
		    }
	    return totalHarvest;
	  }

	  public int getTotalRevenue() {
	    int totalRevenue = 0;
	    for (MultipleHarvest multipleHarvest : multipleHrv) {
	      totalRevenue += multipleHarvest.totalRevenue();
	    }
	    for (SingleHarvest singleHarvest: singleHrv) {
	    	totalRevenue += singleHarvest.totalRevenue();
	    }
	    return totalRevenue;
	  }

	public String getName() {
		return name;
	}
}