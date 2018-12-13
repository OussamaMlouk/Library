
public class Runner {
	public static void main(String[] args) {
		Car c1 = new Car("red", 90, 20, "DU10GVZ", 5);
		Motorbike m1 = new Motorbike("black", 70, 10, "Scooter", "V-twin");
		Aeroplane a1 = new Aeroplane("white", 200, 130, "Large", 51000);

		Garage garage = new Garage();
		garage.addToList(c1);
		garage.addToList(m1);
		garage.addToList(a1);
		garage.printList();
		
		garage.removeFromListByVehicleType("Motorbike");
		garage.printList();

		garage.calculateBill();
		garage.removeFromListByID(c1);
		garage.printList();
		
		
		garage.removeFromListByVehicleType("Car");
		

//		garage.fixVehicle(m1);
//
//		garage.emptyGarage();
//		garage.printList();
//		
		
	}

}
