package galaxyobject;

public class EarthResource {
	/*SILVER(17),
	GOLD(14450),
	IRON(195.5);*/
	
	private double value;
	private String name;
	private int count;
	
	public EarthResource(String name){
		this.name=name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double d) {
		this.value = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
