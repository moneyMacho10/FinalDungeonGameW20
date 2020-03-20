package dungeon.characters;

public class Sorceress extends Hero {
	
	private final int MIN_ADD = 25;
	private final int MAX_ADD = 50;
	
    Sorceress() {
    	
		super("Sorceress", 75, 5, .7, 25, 50, .3);
    }

	private void increaseHitPoints() {
		
		int hPoints;

		hPoints = (int)(Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
		System.out.println(name + " added [" + hPoints + "] health.");
		addHitPoints(hPoints);
    }//end increaseHitPoints method
	
	@Override
	public String attackDescription() {
		return "casts a fireball spell";
	}
	
	@Override
	public void specialAttack(Monster theMonster) {
		increaseHitPoints();
	}

	@Override
	public String specialAttackDescription() {
		return "Increase Hit Points";
	}
	
}//end class Sorceress