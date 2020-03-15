package dungeon.characters;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */



public class Sorceress extends Hero
{
	public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;
	
//-----------------------------------------------------------------
    Sorceress()
	{
		super("Sorceress", 75, 5, .7, 25, 50, .3);
    }//end constructor

//-----------------------------------------------------------------
	private void increaseHitPoints()
    {
	    int hPoints;

		hPoints = (int)(Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
		addHitPoints(hPoints);
		System.out.println(name + " added [" + hPoints + "] points.\n"
							+ "Total hit points remaining are: "
							+ hitPoints);
		 System.out.println();

    }//end increaseHitPoints method

//-----------------------------------------------------------------
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " casts a spell of fireball at " +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method

	@Override
	public void specialAttack(Monster theMonster)
	{
		increaseHitPoints();
	}

	@Override
	public String specialAttackDescription() {
		return "Increase Hit Points";
	}
}//end class