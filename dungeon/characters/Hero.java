package dungeon.characters;
import java.util.Scanner;

public abstract class Hero extends DungeonCharacter {
	
	protected double chanceToBlock;

	public Hero(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax, double chanceToBlock)
	{
		super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
		this.chanceToBlock = chanceToBlock;
		readName();
	}
	
	public void readName() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter character name: ");
		name = keyboard.nextLine();
	}

	public boolean defend() {
		
		return Math.random() <= chanceToBlock;
	}
	
	@Override
	public void subtractHitPoints(int hitPoints) {
		
		if (defend()) {
			System.out.println(name + " BLOCKED the attack!");
		}
		else {
			super.subtractHitPoints(hitPoints);
		}
	}
	
	public int determineNumberOfTurns(DungeonCharacter opponent)
	{
	    int numTurns = attackSpeed/opponent.getAttackSpeed();

		if (numTurns <= 0)
			numTurns = 1;
		
		return numTurns;
	}

	public abstract String attackDescription();
	public abstract void specialAttack(Monster theMonster);
	public abstract String specialAttackDescription();

}//end Hero class