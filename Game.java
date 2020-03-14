
public class Game {

	private Dungeon mDungeon; 
	private Hero mHero;
	public Game(Dungeon dungeon, Hero hero) {
		mDungeon = dungeon; 
		mHero = hero;
		
	}
	
	
	public Hero getHero() {
		return mHero;
	}
	
	public Dungeon getMaze() {
		return mDungeon;
	}
	
}


