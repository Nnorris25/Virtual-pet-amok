
public class OrganicDog extends OrganicPet  {
 
	public OrganicDog(String petName, String petDescription, int health, int happiness, int hunger, int thirst,
			int wasteLevel) {
		super(petName, petDescription, health, happiness, hunger, thirst, wasteLevel);

	}


	public String getStatus() {
		String status = "";
		status += "thirst: " + getThirst();
		status += "\n";
		status += "hunger: " + getHunger();
		status += "\n";
		status += "Happiness: " + getHappiness();
		status += "\n";
		status += "waste level: " + getWasteLevel();
		return status;
	}

}
