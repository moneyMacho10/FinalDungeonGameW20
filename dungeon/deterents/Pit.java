package dungeon.deterents;
import java.util.Random;
import dungeon.characters.*;

public class Pit {
	private int minDamage;
	private int maxDamage;
	private int damageDealt;
	private DungeonCharacter hero;
	
	public Pit(){
		this.minDamage = 10;
		this.maxDamage = 30;
	}
	
	public void fallInPit(DungeonCharacter hero) {
		this.hero = hero;
		Random randomDamage = new Random();
		this.damageDealt = randomDamage.nextInt(this.maxDamage) + this.minDamage;
		hero.subtractHitPoints(this.damageDealt);
	}
	
	@Override
	public String toString() {
		return this.hero.getName() + " fell into a pit and lost " + this.damageDealt + " health.";
	}
}
