package dungeon.dungeoncharacter;


/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Thief extends Hero
{

    Thief()
	{
    	//name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock
		super("Thief", 75, 6, .8, 20, 40, .5);
    }//end constructor

	private void surpriseAttack(DungeonCharacter opponent)
	{
		double surprise = Math.random();
		if (surprise <= .4)
		{
			System.out.println("Surprise attack was successful!\n" +
								name + " gets an additional turn.");
			numTurns++;
			attack(opponent);
		}//end surprise
		else if (surprise >= .9)
		{
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +
								" blocked your attack!");
		}
		else
		    attack(opponent);


	}//end surpriseAttack method
	
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " kicks enemies face \n" +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method
	
	@Override
	public void specialAttack(Monster theMonster){
    	surpriseAttack(theMonster);
	}

	@Override
	public String specialAttackDescription() {
		return "Surprise Attack";
	}
}