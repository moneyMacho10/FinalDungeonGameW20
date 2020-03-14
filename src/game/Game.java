
public class Game {

	private Dungeon mDungeon; 
	private Hero mHero;
	public Game(Dungeon dungeon, Hero hero) {
		mDungeon = dungeon; 
		mHero = hero;
		
	}
	
	
	public Game(Hero mHero2) {
		this.mHero = mHero2;
		
		// TODO Auto-generated constructor stub
	}


	public Hero getHero() {
		return mHero;
	}
	
	public Dungeon getMaze() {
		return mDungeon;
	}
	
}


