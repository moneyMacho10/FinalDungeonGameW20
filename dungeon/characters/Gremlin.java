package dungeon.characters;

public class Gremlin extends Monster {
	
    Gremlin() {
    	
		super("Gremlin", 70, 5, .8, .4, 15, 30, 20, 40);
    }

    @Override
    public String attackDescription() {
    	return "jabs his kris";
    }

}//end class Gremlin