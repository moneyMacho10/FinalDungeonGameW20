package dungeon.characters;

public class Warrior extends Hero {
    Warrior() {
    	
		super("Warrior", 125, 4, .8, 35, 60, .2);
    }
    
	private void crushingBlow(DungeonCharacter opponent) {
		
		if (Math.random() <= .4) {
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println(name + " lands a CRUSHING BLOW for " + blowPoints + " damage!");
			opponent.subtractHitPoints(blowPoints);
		}
		else {
			System.out.println(name + " failed to land a crushing blow");
			System.out.println();
		}

	}//end crushingBlow method
/*
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " swings a mighty sword at " +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method
*/
	@Override
	public String attackDescription() {
		return "swings mighty sword";
	}
	
	@Override
	public void specialAttack(Monster theMonster) {
		crushingBlow(theMonster);
	}

	@Override
	public String specialAttackDescription() {
		return "Crushing Blow";
	}
}//end class Warrior