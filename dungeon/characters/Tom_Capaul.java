package dungeon.characters;


/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Tom_Capaul extends Hero
{

    Tom_Capaul()
	{
    	//name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock
		super("Super Tom Capaul", 75, 6, .8, 20, 40, .5);
    }//end constructor

	private void flees(DungeonCharacter opponent)
	{
		double surprise = Math.random();
		if (surprise <= .4)
		{
			System.out.println("Successfully fled to UW");
			numTurns++;
			attack(opponent);
		}//end surprise
		else if (surprise >= .9)
		{
			System.out.println("Uh oh! " + opponent.getName() + " saw you and didn't let you run away");
		}
		else
		    attack(opponent);
	}//end surpriseAttack method
	
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " throws a rock at \n" +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method
	
	@Override
	public void specialAttack(Monster theMonster){
    	flees(theMonster);
	}

	@Override
	public String specialAttackDescription() {
		return "Flees the premise";
	}
}
