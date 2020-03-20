package dungeon.pillars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PillarsTest {

	Pillar pillar = new Pillar();
	
	@Test
	public void testGetNumberOfPillars() {
		assertFalse(pillar.haveAllPillars());
	}
	
	@Test
	public void testToString() {
		assertEquals("\nYou have found a Pillar of OO.\n", pillar.toString());
	}
}
