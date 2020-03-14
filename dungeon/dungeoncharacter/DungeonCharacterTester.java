

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class DungeonCharacterTester {

	DungeonCharacter warrior;
	DungeonCharacter ogre;
	
	@BeforeEach
	public void setUp() throws Exception{
		warrior = new Warrior();
		ogre = new Ogre();
	}
	
	@Test
	public void testAddHitPoints() {
		int addedHP = 5;
		
		warrior.addHitPoints(addedHP);
		assertEquals(130, warrior.getHitPoints());
		
		ogre.addHitPoints(addedHP);
		assertEquals(205, ogre.getHitPoints());
	}

}
