package dungeon.characters;

public class Zombie extends Monster
{

    Zombie()
	{
    	//name, hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal
		super("Xurg the Zombie", 120, 5, .9, .1, 35, 55, 20, 25);

    }//end constructor

	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " chomps his jaws at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack


}//end class Skeleton
