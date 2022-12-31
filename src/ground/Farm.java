package ground;

import java.util.ArrayList;
import java.util.List;

public class Farm {
	  private String name;
	  private List<Field> fields;

	  public Farm(String name) {
	    this.name = name;
	    this.fields = new ArrayList<>();
	  }
	  public String getName()
	  {
		  return name;
	  }

	  public void addField(Field field) {
	    fields.add(field);
	  }

	  public List<Field> getFields() {
	    return fields;
	  }

	  public int getTotalArea() {
	    int totalArea = 0;
	    for (Field field : fields) {
	      totalArea += field.getArea();
	    }
	    return totalArea;
	  }

	  public int getTotalHarvest() {
	    int totalHarvest = 0;
	    for (Field field : fields) {
	      totalHarvest += field.getTotalHarvest();
	    }
	    return totalHarvest;
	  }

	  public int getTotalRevenue() {
	    int totalRevenue = 0;
	    for (Field field : fields) {
	      totalRevenue += field.getTotalRevenue();
	    }
	    return totalRevenue;
	  }
}
