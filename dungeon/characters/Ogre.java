package dungeon.characters;

public class Ogre extends Monster {
	
    Ogre() {
    	
		super("Ogre", 200, 2, .6, .1, 30, 50, 30, 50);
    }
    
    @Override
    public String attackDescription() {
    	return "slowly swings a club";
    }
}//end class Ogre