package dungeon.characters;

public class Zombie extends Monster {

    Zombie() {
    	
		super("Zombie", 120, 5, .9, .1, 35, 55, 20, 25);
    }
/*
	@Override
	public void attack(DungeonCharacter opponent)
	{
		System.out.println(name + " chomps his jaws at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}//end override of attack
*/
    @Override
    public String attackDescription() {
    	return "chomps their jaws";
    }

}//end class Zombie
