package dungeon.characters;

public class Stu_Steiner extends Monster
{

    Stu_Steiner()
	{
    	//name, hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal
		super("Evil Stu Steiner", 60, 2, 1, .8, 30, 40, 35, 55);

    }//end constructor

	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " belly bumps " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end class Skeleton
