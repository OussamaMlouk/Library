
public class Car extends Vehicle {
	private String regPlate;
	private int numberOfSeats;

	public Car(String colour, int maxSpeed, int engineSize, String regPlate, int numberOfSeats) {
		super(colour, maxSpeed, engineSize);
		this.regPlate = regPlate;
		this.numberOfSeats = numberOfSeats;
	}

	public String getReg() {
		return regPlate;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setReg(String regPlate) {
		this.regPlate = regPlate;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return getColour() +" "+ getMaxSpeed()+" "+ getEngineSize()+" "+ regPlate + " " + numberOfSeats;
	}

}
