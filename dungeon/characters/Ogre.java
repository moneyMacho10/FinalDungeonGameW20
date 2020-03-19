package dungeon.characters;

public class Ogre extends Monster {
	
    Ogre() {
    	
		super("Oscar the Ogre", 200, 2, .6, .1, 30, 50, 30, 50);
    }
/*
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slowly swings a club toward's " +
							opponent.getName() + ":");
	}//end override of attack
*/
    @Override
    public String attackDescription() {
    	return "slowly swings a club";
    }
}//end class Ogre