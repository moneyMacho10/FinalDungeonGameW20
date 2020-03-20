package dungeon.characters;


public class Thief extends Hero {
	
	public final int MIN_ADD = 1;
	public final int MAX_ADD = 3;
	
    Thief() {
    	
		super("Thief", 75, 6, .8, 20, 40, .5);
    }

    private void addAttackSpeed() {
		
		int addSpeed;
		
		addSpeed = (int)(Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
		addAttackSpeed(addSpeed);
    }//end increaseHitPoints method

	@Override
    public String attackDescription() {
    	return "kicks enemies face";
    }
	
	@Override
	public void specialAttack(Monster theMonster){
    	addAttackSpeed();
	}

	@Override
	public String specialAttackDescription() {
		return "Quick Attack";
	}
}//end class Thief