package dungeon.characters;

public class Skeleton extends Monster {
	
    Skeleton() {
    	
		super("Skeleton", 100, 3, .8, .3, 30, 50, 30, 50);
    }

    @Override
    public String attackDescription() {
    	return "slices rusty blade";
    }

}//end class Skeleton