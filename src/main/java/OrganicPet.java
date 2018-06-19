
public class OrganicPet extends VirtualPet {
	protected int hunger;
	protected int thirst;
	protected int wasteLevel;
	protected int litterBox;

	public int getLitterBox() {
		return litterBox;
	}

	public OrganicPet(String petName, String petDescription, int health, int happiness, int hunger, int thirst,
			int wasteLevel) {
		super(petName, petDescription, health, happiness);
		this.hunger = hunger;
		this.thirst = thirst;
		this.wasteLevel = wasteLevel;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public void cleanOneCage() {
		this.happiness = happiness +10;
		this.wasteLevel = wasteLevel - 10;

	}

	public void cleanShelterBox() {
		litterBox = litterBox - 10;

	}

	public void waterPet() {
		this.thirst = thirst - 25;
		this.happiness++;

	}

	public void feedPet() {
		this.hunger = hunger + 20;

	}

}