import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicleList = new ArrayList<>();

	public void addToList(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}

	public void printList() {
		System.out.println(vehicleList);
	}

	public void calculateBill() {
		for (Vehicle vehicle : vehicleList) {
			if (vehicle instanceof Car) {
				System.out.println(((Car) vehicle).getMaxSpeed() * 5);
			} else if (vehicle instanceof Motorbike) {
				System.out.println(((Motorbike) vehicle).getMaxSpeed() * 5);
			} else if (vehicle instanceof Aeroplane) {
				System.out.println(((Aeroplane) vehicle).getMaxSpeed() * 5);
			}
		}
	}

	public void removeFromListByID(Vehicle vehicle) {
		vehicleList.remove(vehicle);
	}

	public void removeFromListByVehicleType(String type) {
		for (Vehicle vehicle : vehicleList) {
			if (vehicle.getClass().getSimpleName().equals(type)) {
				vehicleList.remove(vehicle);
			}
		}
	}

	public void fixVehicle(Vehicle vehicle) {
		if (vehicle instanceof Car) {
			System.out.println(((Car) vehicle).getMaxSpeed() * 5);
		} else if (vehicle instanceof Motorbike) {
			System.out.println(((Motorbike) vehicle).getMaxSpeed() * 5);
		} else if (vehicle instanceof Aeroplane) {
			System.out.println(((Aeroplane) vehicle).getMaxSpeed() * 5);
		}

	}

	public void emptyGarage() {
		vehicleList.clear();
	}

}
