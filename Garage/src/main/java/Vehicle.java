
public abstract class Vehicle {
	private String colour;
	private int maxSpeed;
	private int engineSize;
	
	public Vehicle(String colour, int maxSpeed, int engineSize) {
		this.colour = colour;
		this.maxSpeed = maxSpeed;
		this.engineSize = engineSize;
	}

	public String getColour() {
		return colour;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
}
