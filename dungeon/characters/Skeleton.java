package dungeon.characters;

public class Skeleton extends Monster {
	
    Skeleton() {
    	
		super("Sargath the Skeleton", 100, 3, .8, .3, 30, 50, 30, 50);
    }
/*
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " slices his rusty blade at " +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack
*/
    @Override
    public String attackDescription() {
    	return "slices rusty blade";
    }

}//end class Skeleton