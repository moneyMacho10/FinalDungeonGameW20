package dungeon.characters;

public class Warrior extends Hero {
    Warrior() {
    	
		super("Warrior", 125, 4, .8, 35, 60, .2);
    }
    
	private void crushingBlow(DungeonCharacter opponent) {
		
		if (Math.random() <= .4) {
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println(name + " lands a CRUSHING BLOW for " + blowPoints + " damage!\n");
			opponent.subtractHitPoints(blowPoints);
		}
		else {
			System.out.println(name + " failed to land a crushing blow\n");
		}

	}//end crushingBlow method

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