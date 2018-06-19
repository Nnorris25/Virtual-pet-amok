
public class OrganicDog extends OrganicPet  {
 
	public OrganicDog(String petName, String petDescription, int health, int happiness, int hunger, int thirst,
			int wasteLevel) {
		super(petName, petDescription, health, happiness, hunger, thirst, wasteLevel);

	}


	public String getStatus() {
		String status = "";
		status += "thirst: " + thirst;
		status += "\n";
		status += "hunger: " + hunger;
		status += "\n";
		status += "Happiness: " + happiness;
		status += "\n";
		status += "waste level: " + wasteLevel;
		return status;
	}

}
