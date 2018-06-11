import java.util.Scanner;

public class VirtualPetAmokApp extends VirtualPet {
	public VirtualPetAmokApp(String petName, String petDescription, int health, int happiness) {
		super(petName, petDescription, health, happiness, hunger, thirst, oilLevel, happiness);

	}

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		VirtualPetShelter pets = new VirtualPetShelter();
		OrganicDog dog1 = new OrganicDog("Johnson", "cute little pupp", 50, 50, 50, 50, 50);
		OrganicDog dog2 = new OrganicDog("John", "Vicious shihtzu", 50, 50, 50, 50, 50);
		OrganicDog dog3 = new OrganicDog("Kane", "Bulldog", 50, 50, 50, 50, 50);

		OrganicCat cat1 = new OrganicCat("Maulik", "The worlds favorite cat", 50, 50, 50, 50, 50, 50);
		OrganicCat cat2 = new OrganicCat("Charles", "Just your average cat", 50, 50, 50, 50, 50, 50);
		OrganicCat cat3 = new OrganicCat("Jimmy", "Still just your average cat", 50, 50, 50, 50, 50, 50);

		RoboticDog roboDog1 = new RoboticDog("Richard", "aspires to take overt the world", 50, 50, 50);
		RoboticDog roboDog2 = new RoboticDog("Jack", "manufactured in china", 50, 50, 50);

		pets.addPet(dog1);
		pets.addPet(dog2);
		pets.addPet(dog3);

		pets.addPet(cat1);
		pets.addPet(cat2);
		pets.addPet(cat3);

		pets.addPet(roboDog1);
		pets.addPet(roboDog2);
		System.out.println("Welcome to Nate's animal shelter");
		System.out.println("Here is a list of all the pets we have int the shelter!");
		System.out.println("Name   \t|Type     ");
		System.out.println("-------\t|---------");
		System.out.println("Johnson\t|Dog      ");
		System.out.println("John   \t|Dog      ");
		System.out.println("Kane   \t|Dog      ");
		System.out.println("Maulik \t|Cat      ");
		System.out.println("Charles\t|Cat      ");
		System.out.println("Jimmy  \t|Cat      ");
		System.out.println("Richard\t|RoboDog  ");
		System.out.println("Jack   \t|RoboDog  ");
		System.out.println("What would you like to do next?\n1.Feed organic pets\n2.Water pet organic pets\n3.Walk dogs\n4.Clean cages\n5.Clean litterbox\n6.Oil robotic pets");

		boolean keepPlaying = true;

		while (keepPlaying) {
			String command = input.nextLine();
			if (command.equals("1")) {
				pets.tickAllPets();
				pets.feedAllPets();
				System.out.println(dog1.getStatus());
				System.out.println(dog2.getStatus());
				System.out.println(dog3.getStatus());
				System.out.println(cat1.getStatus());
				System.out.println(cat2.getStatus());
				System.out.println(cat3.getStatus());
				System.out.println(
						"What would you like to do next?\n1.Feed organic pets\n2.Water pet organic pets\n3.Walk dogs\n4.Clean cages\n5.Clean litterbox\n6.Oil robotic pets");
			} else if (command.equalsIgnoreCase("2")) {
				pets.tickAllPets();
				pets.waterAllPets();
				System.out.println(dog1.getStatus());
				System.out.println(dog2.getStatus());
				System.out.println(dog3.getStatus());
				System.out.println(cat1.getStatus());
				System.out.println(cat2.getStatus());
				System.out.println(cat3.getStatus());
				System.out.println(
						"What would you like to do next?\n1.Feed organic pets\n2.Water pet organic pets\n3.Walk dogs\n4.Clean cages\n5.Clean litterbox\n6.Oil robotic pets");
			} else if (command.equalsIgnoreCase("3")) {
				pets.tickAllPets();
				pets.walkAllDogs();
				System.out.println(dog1.getStatus());
				System.out.println(dog2.getStatus());
				System.out.println(dog3.getStatus());
				System.out.println(
						"What would you like to do next?\n1.Feed organic pets\n2.Water pet organic pets\n3.Walk dogs\n4.Clean cages\n5.Clean litterbox\n6.Oil robotic pets");
			} else if (command.equalsIgnoreCase("4")) {
				pets.tickAllPets();
				pets.cleanAllCages();
				System.out.println(dog1.getStatus());
				System.out.println(dog2.getStatus());
				System.out.println(dog3.getStatus());
				System.out.println(
						"What would you like to do next?\nOptions are 1. Feed organic pets\n2.Water pet organic pets\n3.Walk dogs,\n4.Clean cages\n5.Clean litterbox\n6.Oil robotic pets");

			} else if (command.equalsIgnoreCase("5")) {
				pets.tickAllPets();
				pets.cleanLitterBox();
				System.out.println(cat1.getStatus());
				System.out.println(cat2.getStatus());
				System.out.println(cat3.getStatus());
				System.out.println(
						"What would you like to do next?\n1.Feed organic pets\n2.Water pet organic pets\n3.Walk dogs\n4.Clean cages\n5.Clean litterbox\n6.Oil robotic pets");

			}else if(command.equalsIgnoreCase("6")) {
			pets.tickAllPets();
			pets.oilAllPet();
			System.out.println(roboDog1.getStatus());
			System.out.println(roboDog2.getStatus());
			System.out.println(
					"What would you like to do next?\n1.Feed organic pets\n2.Water pet organic pets\n3.Walk dogs\n4. Clean cages\n5.Clean litterbox\n6.Oil robotic pets");
			}else if(command.equals("7")) {
				System.out.println("You suck!");
				System.exit(0);
				
			}

		}

	}

}
