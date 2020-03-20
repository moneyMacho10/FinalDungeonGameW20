package dungeon.characters;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterTest {

	Warrior warrior;
	Sorceress sorceress;
	Thief thief;
	Wonder_Duck wonderDuck;
	Tom_Capaul tom;
	
	Ogre ogre;
	Skeleton skeleton;
	Gremlin gremlin;
	Zombie zombie;
	Stu_Steiner stu;
	
	@BeforeEach
	public void setUp() throws Exception{
		warrior = new Warrior();
		sorceress = new Sorceress();
		thief = new Thief();
		wonderDuck = new Wonder_Duck();
		tom = new Tom_Capaul();
		
		ogre = new Ogre();
		skeleton = new Skeleton();
		gremlin = new Gremlin();
		zombie = new Zombie();
		stu = new Stu_Steiner();
	}
	
	@Test
	void testAttackDescription() {
		assertEquals("swings mighty sword", warrior.attackDescription());
		assertEquals("casts a fireball spell", sorceress.attackDescription());
		assertEquals("kicked", thief.attackDescription());
		assertEquals("pecked", wonderDuck.attackDescription());
		assertEquals("throws a rock at", tom.attackDescription());
		assertEquals("slowly swings a club", ogre.attackDescription());
		assertEquals("slices rusty blade", skeleton.attackDescription());
		assertEquals("jabs his kris", gremlin.attackDescription());
		assertEquals("chomps their jaws", zombie.attackDescription());
		assertEquals("belly bumps", stu.attackDescription());
	}
	
	@Test
	void testSpecAttackDescription() {
		assertEquals("Crushing Blow", warrior.specialAttackDescription());
		assertEquals("Increase Hit Points", sorceress.specialAttackDescription());
		assertEquals("Quick Attack", thief.specialAttackDescription());
		assertEquals("Sonic Quack", wonderDuck.specialAttackDescription());
		assertEquals("Flees the premise", tom.specialAttackDescription());
	}
	

}
