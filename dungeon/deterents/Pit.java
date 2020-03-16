package dungeon.deterents;
import java.util.Random;
import dungeon.characters.*;

public class Pit {
	private int minDamage;
	private int maxDamage;
	private int damageDealt;
	
	public Pit(){
		this.minDamage = 10;
		this.maxDamage = 30;
	}
	
	public void fallInPit(DungeonCharacter hero) {
		Random randomDamage = new Random();
		this.damageDealt = randomDamage.nextInt(this.maxDamage) + this.minDamage;
		hero.subtractHitPoints(this.damageDealt);
		
	}
}
