package dungeon;

import java.util.Random;
import java.util.Scanner;
import dungeon.characters.*;
import dungeon.Game;
import dungeon.maze.Dungeon;

public class DungeonAdventure
{
	public static Hero mHero;; 
	static Dungeon mMaze;
	static Monster mMonster;
	
	//static Dungeon dungeon;
    static Game mGame;
    
    Battle mBattle;

	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		do
		{
			displayGameRules();

			HeroFactory myHeroFactory = new HeroFactory();
			mHero = myHeroFactory.generateHero();
			
			MonsterFactory myMonsterFactory = new MonsterFactory();
			mMonster = myMonsterFactory.generateMonster();
				
			Battle.battle(mHero, mMonster);
			//playGame(mHero);
			
				
		} while(playAgain());
		
		System.out.println("DUNGEON GAME MODE: CREATORS THANKS FOR PLAYING");
			
    	if(!mHero.isAlive()) {
    		System.out.println("GG GAME OVER");
    	}
    	else {
    		System.out.println("you found four oo pillars");
    	}
	}

	private static void playGame(Hero mHeroGame) {
		mGame = new Game(mHero);
		Battle.battle(mHero, mMonster);
	}

	private static void displayGameRules() {

    	  System.out.println("\nDungeon Maze Game: ");
    	  System.out.println("_____________________________________________________________________________________________\n");
          System.out.println("User must travel the maze, where MONSTERS are hidden");
          System.out.println("Collect the FOUR Pillars of Object Oritentated Programming: (O.O) ");
          System.out.println("\t\tAbstraction\n \t\tEncapsulation\n  \t\tInheritance\n \t\tPolymorphism");
          System.out.println("_____________________________________________________________________________________________\n");                                              
	}
	
	public static boolean playAgain()
	{
		Scanner keyboard = new Scanner(System.in);

		String choice = "";

		while(!(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")))
		{
			System.out.print("Play again (y/n)? --> ");
			choice = keyboard.nextLine();
			System.out.println();

			if(!(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")))
				System.out.println("MAKE UP YOUR MIND HERO");
		}

		return (choice.equalsIgnoreCase("y"));
	}//end playAgain method
	
}//end Dungeon class
