

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */




public class Warrior extends Hero
{

    Warrior()
	{
    	//name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock
		super("Warrior", 125, 4, .8, 35, 60, .2);


    }//end constructor


	private void crushingBlow(DungeonCharacter opponent)
	{
		if (Math.random() <= .4)
		{
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println(name + " lands a CRUSHING BLOW for " + blowPoints
								+ " damage!");
			opponent.subtractHitPoints(blowPoints);
		}//end blow succeeded
		else
		{
			System.out.println(name + " failed to land a crushing blow");
			System.out.println();
		}//blow failed

	}//end crushingBlow method

	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " swings a mighty sword at " +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method

	@Override
	public void specialAttack(Monster theMonster)
	{
		crushingBlow(theMonster);
	}

	@Override
	public String specialAttackDescription() {
		return "Crushing Blow";
	}
}//end Hero class