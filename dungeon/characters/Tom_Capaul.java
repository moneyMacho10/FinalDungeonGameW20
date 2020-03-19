package dungeon.characters;

public class Tom_Capaul extends Hero {
	
    Tom_Capaul() {
    	
		super("Super Tom Capaul", 75, 6, .8, 20, 40, .5);
    }

	private void flees(DungeonCharacter opponent) {
		
		double chance = Math.random();
System.out.println("Test: printing out random number chance: " + chance);	
		if (chance <= .4) {
			System.out.println("You tripped and fell! Ouch. No getting out of this one I guess...");
		}
		else
			System.out.println("Uh oh! " + opponent.getName() + " saw you and didn't let you run away");
	}//end surpriseAttack method
	
/*
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " throws a rock at \n" +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method
*/
	
	@Override
    public String attackDescription() {
    	return "throws a rock at";
    }
	
	@Override
	public void specialAttack(Monster theMonster){
    	flees(theMonster);
	}

	@Override
	public String specialAttackDescription() {
		return "Flees the premise";
	}
} //end class Tom Capaul
