
public class VirtualPet {
	private String petName;
	private String petDescription;
	private int health=50;
	protected int happiness=50;
	protected static int hunger=50;
	protected static int thirst=50;
	protected static int wasteLevel=50;
	protected static int litterBox=50;
	protected static int oilLevel = 50;
	public VirtualPet(String petName, String petDescription) {
		this(petName, petDescription, 50, 50, 50, 50, 50, 50);

	}

	// constructor

	public VirtualPet(String petName, String petDescription, int health, int happiness, int hunger, int thirst,
			int wasteLevel, int litterBox) {
		super();
		this.petName = petName;
		this.petDescription = petDescription;
		this.health = health;
		this.happiness = happiness;
		this.hunger = hunger;
		this.thirst = thirst;
		this.wasteLevel = wasteLevel;
		this.litterBox = litterBox;
	}

	

	public String getPetName() {
		return petName;
	}

	public String getPetDescription() {
		return petDescription;
	}

	public int getHappiness() {
		return happiness;
	}


	public int getHealth() {
		return health;
	}

	public void walkDog() {
		this.happiness += 10;
		this.wasteLevel -= 10;
		this.health +=10;
	}

	public void tick() {
		health++;
		happiness++;

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

	public int getLitterBox() {
		return litterBox;
	}

	public void feedPet() {
	 VirtualPet.hunger += 6;
	 
		
	}

	public void cleanOneCage() {
		VirtualPet.wasteLevel -= 5;
		
	}

	public void waterPet() {
		VirtualPet.thirst -= 7;
		
	}

	public void cleanShelterBox() {
		VirtualPet.wasteLevel -=7;
		
	}

	

	public void oilPet() {
		VirtualPet.oilLevel -= 15;
		
	}

	public int getOilLevel() {
		return oilLevel;
	}



}
