
public class VirtualPet {
	private String petName;
	private String petDescription;
	private int health;
	protected int happiness;

	

	public VirtualPet(String petName, String petDescription, int health, int happiness) {
		super();
		this.petName = petName;
		this.petDescription = petDescription;
		this.health = health;
		this.happiness = happiness;
	}

	public String getPetName() {
		return petName;
	}

	public String getPetDescription() {
		return petDescription;
	}

	public int getHappiness() {
		return happiness + 15;
	}

	public int getHealth() {
		return health -10;
	}

	

	public void tick() {
		health++;
		happiness++;

	}

	public void walk() {
		health++;
		happiness++;
	
		
	}



}
