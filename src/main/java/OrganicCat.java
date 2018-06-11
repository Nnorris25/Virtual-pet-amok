
public class OrganicCat extends VirtualPet {

	public OrganicCat(String petName, String petDescription, int health, int happiness, int hunger, int thirst,
			int wasteLevel, int litterBox) {
		super(petName, petDescription, health, happiness, hunger, thirst, wasteLevel, litterBox);
		
	}
	public String getStatus() {
		String status = "";
		status += "thirst: " + thirst;
		status += "\n";
		status += "hunger: " + hunger;
		status += "\n";
		status +="litter box level: " + getLitterBox();
		status += "\n";
		status += "Happiness: " + happiness;
		status += "\n";
		status += "waste level: " + getWasteLevel();
		return status;
	}
}