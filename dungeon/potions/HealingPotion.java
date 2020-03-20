package dungeon.potions;
import dungeon.characters.*;
import java.util.Random;

public class HealingPotion{
	private int healingDone;
	private int maxHealth;
	private DungeonCharacter player;

	public HealingPotion() {
		this.maxHealth = 20;
	}
	
	public void usePotion(DungeonCharacter character) {
		this.player = character;
		character.addHitPoints(healingDone = new Random().nextInt(maxHealth));

	}
	
	@Override
	public String toString() {
		return "\n" + this.player.getName() + " gained " + this.healingDone + " health from a potion.\n";
	}

}
