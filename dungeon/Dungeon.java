package dungeon;

import java.util.Random;
import java.util.Scanner;
import dungeon.characters.*;
import dungeon.Game;
import dungeon.maze.Maze;


/**
 * Title: Dungeon.java
 *
 * Description: Driver file for Heroes and Monsters project
 *
 * Copyright:    Copyright (c) 2001
 * Company: Code Dogs Inc.
 * I.M. Knurdy
 *
 * History:
 *  11/4/2001: Wrote program
 *    --created DungeonCharacter class
 *    --created Hero class
 *    --created Monster class
 *    --had Hero battle Monster
 *    --fixed attack quirks (dead monster can no longer attack)
 *    --made Hero and Monster abstract
 *    --created Warrior
 *    --created Ogre
 *    --made Warrior and Ogre battle
 *    --added battleChoices to Hero
 *    --added special skill to Warrior
 *    --made Warrior and Ogre battle
 *    --created Sorceress
 *    --created Thief
 *    --created Skeleton
 *    --created Gremlin
 *    --added game play features to Dungeon.java (this file)
 *  11/27/2001: Finished documenting program
 * version 1.0
 */



/*
  This class is the driver file for the Heroes and Monsters project.  It will
  do the following:

  1.  Allow the user to choose a hero
  2.  Randomly select a monster
  3.  Allow the hero to battle the monster

  Once a battle concludes, the user has the option of repeating the above

*/
public class Dungeon
{
	public static Hero mHero;; 
	static Maze mMaze;
	static Monster mMonster;
	
	//static Dungeon dungeon;
    static Game mGame;
    
    Battle mBattle;

	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		do
		{
		    
			gameRules();
		
			System.out.println("1) PLAY GAME");
			System.out.println("Game Choice: ");
			
			String startGame = keyboard.nextLine();
			
			if(startGame.equalsIgnoreCase("1")) {
			                                                 
		
				HeroFactory myHeroFactory = new HeroFactory();
				mHero = myHeroFactory.generateHero("Hero");
				
				MonsterFactory myMonsterFactory = new MonsterFactory();
				
				mMonster = myMonsterFactory.generateMonster();
				
				Battle.battle(mHero, mMonster);
			
				//playGame(mHero);
			}
				
		} while(playAgain());
		
			System.out.println("DUNGEON GAME MODE: CREATORS THANKS FOR PLAYING");
			
    
    	if(!mHero.isAlive()) {
    		System.out.println("GG GAME OVER");
    	}
    	else {
    		System.out.println("you found four oo pillars");
    	}
    	//add else if(mHero.isAQuitter()
    	

    	
    	
    	// TODO Auto-generated method stub
		
	}

	private static void playGame(Hero mHeroGame) {
		
		mGame = new Game(mHero);
		Battle.battle(mHero, mMonster);
		
		//// TODO Auto-generated method stub
		
	}

	private static void gameRules() {
		
    	  System.out.println("Dungeon Maze Game: ");
    	  System.out.println("_____________________________________________________________________________________________");
          System.out.println("User must travel the maze, where MONSTERS are hidden");
          System.out.println("Collect the FOUR Pillars of Object Oritentated Programming: (O.O) ");
          System.out.println("\t\tAbstraction\n \t\tEncapsulation\n  \t\tInheritance\n \t\tPolymorphism");
          System.out.println("_____________________________________________________________________________________________");                                              
         
	}

    
	/*-------------------------------------------------------------------
	 * Hero: chooseHero(Scanner keyboard) method should get refactored into its own class as the Hero Factory. 
	 * 
	chooseHero allows the user to select a hero, creates that hero, and
	returns it.  It utilizes a polymorphic reference (Hero) to accomplish
	this task
	---------------------------------------------------------------------*/
/*-------------------------------------------------------------------
	playAgain allows gets choice from user to play another game.  It returns
true if the user chooses to continue, false otherwise.
---------------------------------------------------------------------*/
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



//end Dungeon class


}


//
//Can you see this comment? if so were ready to go. 
//
///