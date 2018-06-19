
public class RoboticDog extends RoboticPet {

	public RoboticDog(String petName, String petDescription, int health, int happiness, int oilLevel) {
		super(petName, petDescription, health, happiness, oilLevel);
		
	}


	public String getStatus() {
		String status = "";
		status += "oil level: " + getOilLevel();
		status += "\n";
		status += "Happiness: " + getHappiness();
		return status;
	}

	

	
}