import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetShelterTest {
//	private int petLitterBoxWaste;
	VirtualPet newPet = new VirtualPet("name", "description", 0, 0, 0, 0, 0);
	VirtualPetShelter testShelter = new VirtualPetShelter();
//	this.petLitterBoxWaste=petLitterBoxWaste;

	@Test
	public void shouldAddPetToShelter() {
		int numberOfPetsBeforeAdding = testShelter.getCount();
		testShelter.addPet(newPet);
		int numberOfPetsAfterAdding = testShelter.getCount();
		assertThat( numberOfPetsAfterAdding, is(equalTo(numberOfPetsBeforeAdding + 1)));
		
	}
//	@Test
//	public void shouldRemovePetFromShelter() {
//		int numberOfPetsBeforeRemove = testShelter.getCount();
//		testShelter.removePet(newPet);
//		
//		
		
	}
	

