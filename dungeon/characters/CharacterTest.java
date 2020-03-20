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
	
	@Test
	void testName() {
		assertEquals("Ogre", ogre.getName());
		assertEquals("Skeleton", skeleton.getName());
		assertEquals("Gremlin", gremlin.getName());
		assertEquals("Zombie", zombie.getName());
		assertEquals("Evil Stu Steiner", stu.getName());
		
	}
	
	@Test
	void testHitPoints() {
		assertEquals(125, warrior.getHitPoints());
		assertEquals(75, sorceress.getHitPoints());
		assertEquals(75, thief.getHitPoints());
		assertEquals(20, wonderDuck.getHitPoints());
		assertEquals(75, tom.getHitPoints());
		assertEquals(200, ogre.getHitPoints());
		assertEquals(100, skeleton.getHitPoints());
		assertEquals(70, gremlin.getHitPoints());
		assertEquals(120, zombie.getHitPoints());
		assertEquals(60, stu.getHitPoints());
	}
	
	@Test
	void testAttackSpeed() {
		assertEquals(4, warrior.getAttackSpeed());
		assertEquals(5, sorceress.getAttackSpeed());
		assertEquals(6, thief.getAttackSpeed());
		assertEquals(7, wonderDuck.getAttackSpeed());
		assertEquals(6, tom.getAttackSpeed());
		assertEquals(2, ogre.getAttackSpeed());
		assertEquals(3, skeleton.getAttackSpeed());
		assertEquals(5, gremlin.getAttackSpeed());
		assertEquals(5, zombie.getAttackSpeed());
		assertEquals(2, stu.getAttackSpeed());
	}
	
	@Test
	void testIsAlive() {
		assertTrue(warrior.isAlive());
		assertTrue(sorceress.isAlive());
		assertTrue(thief.isAlive());
		assertTrue(wonderDuck.isAlive());
		assertTrue(tom.isAlive());
		assertTrue(ogre.isAlive());
		assertTrue(skeleton.isAlive());
		assertTrue(gremlin.isAlive());
		assertTrue(zombie.isAlive());
		assertTrue(stu.isAlive());
	}
	

}
