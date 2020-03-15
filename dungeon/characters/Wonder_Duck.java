package dungeon.characters;


/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Wonder_Duck extends Hero
{

    Wonder_Duck()
	{
    	//name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock
		super("The Wonder Duck", 20, 7, .6, 10, 20, .8);
    }//end constructor

	private void sonicQuack(DungeonCharacter opponent)
	{
		double surprise = Math.random();
		if (surprise <= .4)
		{
			System.out.println("Successfully blew thier socks off");
			numTurns++;
			attack(opponent);
		}//end surprise
		else if (surprise >= .9)
		{
			System.out.println("Uh oh! " + opponent.getName() + " covered your quacker and sonic quack failed!");
		}
		else
		    attack(opponent);
	}//end surpriseAttack method
	
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " pecked \n" +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method
	
	@Override
	public void specialAttack(Monster theMonster){
    	sonicQuack(theMonster);
	}

	@Override
	public String specialAttackDescription() {
		return "Sonic Quack";
	}
}
