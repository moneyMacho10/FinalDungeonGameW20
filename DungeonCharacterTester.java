
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//does not test void methods

class DungeonCharacterTester {

	//create heros
	Warrior warrior;
	Sorceress sorceress;
	Thief thief;
	
	//create monsters
	Ogre ogre;
	Skeleton skeleton;
	Gremlin gremlin;
	
	@BeforeEach
	public void setUp() throws Exception{
		//create heros
		warrior = new Warrior();
		sorceress = new Sorceress();
		thief = new Thief();
		
		//create monsters
		ogre = new Ogre();
		skeleton = new Skeleton();
		gremlin = new Gremlin();
	}
	
	//The following 3 tests only need to test one monster or hero because these methods are inherited from DungeonCharacter
	@Test
	public void testAddHitPoints() {
		int addedHP = 5;
		
		warrior.addHitPoints(addedHP);
		assertEquals(130, warrior.getHitPoints());
		
		ogre.addHitPoints(addedHP);
		assertEquals(205, ogre.getHitPoints());
	}
	
	@Test
	public void testSubtractHitPoints() {
		int subtractHP = 10;
		
		warrior.subtractHitPoints(subtractHP);
		assertEquals(115, warrior.getHitPoints());
		
		//cannot test monster subtract points because they heal directly after being hit
	}
	
	@Test
	public void testIsAlive() {
		assertTrue(warrior.isAlive());
		assertTrue(ogre.isAlive());
	}
	
	//This tests each character for their given special attack because each individual Hero has their own unique special attack method
	@Test
	public void testHeroSpecialAttackDescription() {
		assertTrue(warrior.specialAttackDescription().equals("Crushing Blow"));
		assertTrue(sorceress.specialAttackDescription().equals("Increase Hit Points"));
		assertTrue(thief.specialAttackDescription().equals("Surprise Attack"));
	}
}
