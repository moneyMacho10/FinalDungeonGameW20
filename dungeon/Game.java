package dungeon;

import dungeon.characters.DungeonCharacter;
import dungeon.maze.Maze;

public class Game {

	private Maze mDungeon; 
	private DungeonCharacter mHero;
	public Game(Maze dungeon, DungeonCharacter hero) {
		mDungeon = dungeon; 
		mHero = hero;
		
	}
	
	
	public Game(DungeonCharacter mHero2) {
		this.mHero = mHero2;
		
		// TODO Auto-generated constructor stub
	}


	public DungeonCharacter getHero() {
		return mHero;
	}
	
	public Maze getMaze() {
		return mDungeon;
	}
	
}


