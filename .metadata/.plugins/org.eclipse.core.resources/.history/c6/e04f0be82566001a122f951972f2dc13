package dungeon.potions;
import dungeon.dungeoncharacter.DungeonCharacter;
import java.util.Random;

public class HealingPotion implements Potions{
	private int healingDone;
	private int maxHealth = 20;

	@Override
	public void usePotion(DungeonCharacter character) {
	
		character.addHitPoints(healingDone = new Random().nextInt(maxHealth));
		
	}
	
	@Override
	public String toString() {
		
		return String.valueOf(healingDone);
		
	}

}
