package dungeon.characters;

public class Gremlin extends Monster {
	
    Gremlin() {
    	
		super("Gnarltooth the Gremlin", 70, 5, .8, .4, 15, 30, 20, 40);
    }
/*
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " jabs his kris at " +
							opponent.getName() + ":");
		super.attack(opponent);
	}//end override of attack
*/
    @Override
    public String attackDescription() {
    	return "jabs his kris";
    }

}//end class Gremlin