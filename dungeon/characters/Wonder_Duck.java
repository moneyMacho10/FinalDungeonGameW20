package dungeon.characters;

public class Wonder_Duck extends Hero
{

    Wonder_Duck()
	{
    	//name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock
		super("Wonder Duck", 20, 7, .6, 10, 20, .8);
    }//end constructor

	private void sonicQuack(DungeonCharacter opponent)
	{
		if (Math.random() <= .4) {
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println("You successfully blew their socks off! (by " + blowPoints + " points)");
			opponent.subtractHitPoints(blowPoints);
		}
		else {
			System.out.println(opponent.name + " covered your quacker. Sonic Quack Failed!");
			System.out.println();
		}
	}//end surpriseAttack method
/*
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " pecked \n" +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack method
*/
	@Override
    public String attackDescription() {
    	return "pecked";
    }
	
	@Override
	public void specialAttack(Monster theMonster){
    	sonicQuack(theMonster);
	}

	@Override
	public String specialAttackDescription() {
		return "Sonic Quack";
	}
} //end class Wonder Duck
