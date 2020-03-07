

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Ogre extends Monster
{

    Ogre()
	{
    	//name, hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal
		super("Oscar the Ogre", 200, 2, .6, .1, 30, 50, 30, 50);


    }//end constructor

	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slowly swings a club toward's " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end Monster class