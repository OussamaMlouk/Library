
public class Aeroplane extends Vehicle {
	private String size;
	private int maxAltitude;

	public Aeroplane(String colour, int maxSpeed, int engineSize, String size, int maxAltitude) {
		super(colour, maxSpeed, engineSize);
		this.size = size;
		this.maxAltitude = maxAltitude;
	}

	public String getSize() {
		return size;
	}

	public int getMaxAltitude() {
		return maxAltitude;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

	@Override
	public String toString() {

		return getColour() +" "+ getMaxSpeed()+" "+ getEngineSize()+" "+ size + " " + maxAltitude;
	}
}
