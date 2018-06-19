import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	private int wasteLevel;
	private int litterBox=50;
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
		for (VirtualPet pet : petsAmok.values()) {
			if(pet instanceof RoboticDog) {
				((RoboticPet) pet).oilPet();
			}
		}
	}

	public int getLitterBox() {
		return litterBox;
	}

	public void cleanLitterBox() {
		for (VirtualPet pet : petsAmok.values()) {
			if(pet instanceof OrganicCat) {
				((OrganicPet) pet).cleanShelterBox();
			}
		}
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public void cleanAllCages() {
		for (VirtualPet pet : petsAmok.values()) {
			if(pet instanceof OrganicPet) {
				((OrganicPet) pet).cleanOneCage();
			}
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
		for (VirtualPet pet : petsAmok.values()) {
			if(pet instanceof OrganicPet) {
				((OrganicPet) pet).feedPet();
			}
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : petsAmok.values()) {
			if(pet instanceof OrganicPet) {
				((OrganicPet) pet).waterPet();
			}
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
		status += "litter box level: " + litterBox;
		status += "\n";
		status += "Happiness: " + happiness;
		status += "\n";
		status += "waste level: " + wasteLevel;
		return status;
	}

	public void tickAllPets() {
		for (VirtualPet pet : petsAmok.values()) {
			pet.tick();
			if(pet instanceof OrganicPet || pet instanceof RoboticPet) {
				((VirtualPet) pet).tick();
			}
		}
	}

	public void walkAllDogs() {
	for(VirtualPet pet : petsAmok.values()) {
		pet.walk();
		if(pet instanceof OrganicDog || pet instanceof RoboticDog) {
			((VirtualPet) pet).walk();
		}
	}
		
	}

}
