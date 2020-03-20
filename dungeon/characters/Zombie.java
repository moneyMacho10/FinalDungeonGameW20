package dungeon.characters;

public class Zombie extends Monster {

    Zombie() {
    	
		super("Zombie", 120, 5, .9, .1, 35, 55, 20, 25);
    }

    @Override
    public String attackDescription() {
    	return "chomps their jaws";
    }

}//end class Zombie
