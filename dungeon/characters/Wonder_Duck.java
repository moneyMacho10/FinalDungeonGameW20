package dungeon.characters;

public class Wonder_Duck extends Hero
{

    Wonder_Duck() {
    	
		super("Wonder Duck", 20, 7, .6, 10, 20, .8);
    }

	private void sonicQuack(DungeonCharacter opponent)
	{
		if (Math.random() <= .4) {
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println("You successfully blew their socks off! (by " + blowPoints + " hit points)\n");
			opponent.subtractHitPoints(blowPoints);
		}
		else {
			System.out.println(opponent.name + " covered your quacker. Sonic Quack Failed!\n");
			System.out.println();
		}
	}//end surpriseAttack method

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
