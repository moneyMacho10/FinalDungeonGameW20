package dungeon.characters;

public class Stu_Steiner extends Monster {

    Stu_Steiner() {
    	
		super("Evil Stu Steiner", 60, 2, 1, .8, 30, 40, 35, 55);

    }//end constructor

    @Override
    public String attackDescription() {
    	return "belly bumps";
    }
}//end class Stu_Steiner
