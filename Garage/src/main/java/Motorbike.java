
public class Motorbike extends Vehicle {
	private String category;
	private String engineType;

	public Motorbike(String colour, int maxSpeed, int engineSize, String category, String engineType) {
		super(colour, maxSpeed, engineSize);
		this.category = category;
		this.engineType = engineType;
	}

	public String getCategory() {
		return category;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return getColour() +" "+ getMaxSpeed()+" "+ getEngineSize()+" "+ category + " " + engineType;
	}

}
