package Library;

import java.util.ArrayList;

public class Library {

	public ArrayList<Item> itemList = new ArrayList<>();
	public ArrayList<Person> personList = new ArrayList<>();

	public void addItem(Item item) {
		itemList.add(item);
	}

	public void removeItem(Item item) {
		itemList.remove(item);
	}

	public boolean checkOut(Item item) {
		if (item.getAvailable() == true) {
			item.setAvailable(false);
			return true; // if check out successful, returns true
		} else {
			return false; // else, check out unsuccessful
		}

	}

	public boolean checkIn(Item item) {
		if (item.getAvailable() == false) {
			item.setAvailable(true);
			return true; // if check in successful, returns true
		} else {
			return false; // else, check in unsuccessful
		}

	}
	
	public void registerPerson(Person person) {
		personList.add(person);
	}
	
	public void deletePerson(Person person) {
		personList.remove(person);
	}

}
