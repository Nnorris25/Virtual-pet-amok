
public class RoboticPet extends VirtualPet {
 
	private int oilLevel;

	public RoboticPet(String petName, String petDescription, int health, int happiness, int oilLevel) {
		super(petName, petDescription, health, happiness);
		this.oilLevel = oilLevel;
	}

	public int getOilLevel() {
		return oilLevel;
	}

	public void oilPet() {
		oilLevel = oilLevel + 15;
		
	}

	


	
}
