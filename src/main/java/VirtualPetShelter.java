import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	private static int wasteLevel;
	private int litterBox;
	private int oilLevel;
	private int happiness;
	private int thirst;
	private int hunger;
	Map<String, VirtualPet> petsAmok = new HashMap<>();
	Map<String, OrganicPet> orgPet = new HashMap<>();
	Map<String, RoboticPet> roboPet = new HashMap<>();

	public Collection<VirtualPet> getPets() {
		return petsAmok.values();
	}


	public void oilAllPet() {
		for(VirtualPet pet: roboPet.values()) {
			pet.oilPet();
		}
	}

	public int getLitterBox() {
		return litterBox;
	}

	public void cleanLitterBox() {
		for(VirtualPet pet: orgPet.values()) {
			pet.cleanShelterBox();
		}
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public void cleanAllCages() {
		for(VirtualPet pet: orgPet.values()) {
			pet.cleanOneCage();
		}
	}

	public int getCount() {
		return petsAmok.size();
	}

	public void addPet(VirtualPet pet) {
		petsAmok.put(pet.getPetName(), pet);

	}

	public VirtualPet getOnePet(String petName) {
		return orgPet.get(petName);
	}

	public void feedAllPets() {
		for (VirtualPet pet : orgPet.values()) {
			pet.feedPet();
			hunger = hunger - 10;
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : orgPet.values()) {
			pet.waterPet();
			thirst = thirst - 10;
		}
	}

	public String getStatus() {
		String status = "";
		status += "thirst: " + thirst;
		status += "\n";
		status += "hunger: " + hunger;
		status += "\n";
		status += "oil level: " + oilLevel;
		status += "\n";
		status +="litter box level: " + litterBox;
		status += "\n";
		status += "Happiness: " + happiness;
		status += "\n";
		status += "waste level: " + wasteLevel;
		return status;
	}

	public void walkAllDogs() {
		for (VirtualPet pet : petsAmok.values()) {
			pet.walkDog();
			happiness = happiness +10;
		}
	}

	
	public void tickAllPets() {
		for (VirtualPet pet : petsAmok.values()) {
			pet.tick();
		}
	}

}
