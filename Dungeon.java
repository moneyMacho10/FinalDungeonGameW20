import java.util.Random;
import java.util.Scanner;

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
	public static Hero mHero;
	
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
				//battle
				
		
				//playGame(maze, mHero);
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
	public static Hero chooseHero(Scanner keyboard)
	{
		String choice;

		System.out.println("Choose a hero:\n" +
					       "1. Warrior\n" +
						   "2. Sorceress\n" +
						   "3. Thief");
		choice =  keyboard.nextLine();

		switch(choice)
		{
			case "1": return new Warrior();

			case "2": return new Sorceress();

			case "3": return new Thief();

			default: System.out.println("invalid choice, returning Thief");
				     return new Thief();
		}//end switch
	}//end chooseHero method



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



public static void battle(Hero mHero, Monster mMonster) {
	Scanner keyboard = new Scanner(System.in);
	Boolean userQuits = false; 
	
	System.out.println("|_____________________________|");
	
	while(mHero.isAlive() && mMonster.isAlive() && !userQuits) {
		mHero.determineNumberOfTurns(mMonster);
		
		while(mHero.numTurns > 0 && mMonster.isAlive()) {
			
			
			System.out.println("Number of Attacks Left: " + mHero.numTurns);
			
			int attackOption = attackMenu(mHero, keyboard);
			
			if(attackOption == 1){
				mHero.attack(mMonster);
			} 
			//else if(attackOption == 2){
				//mHero.specialAttack(mMonster);
		//	}
			
			mHero.numTurns--;
			
			
		}
		
		//monster's turn (provided it's still alive!)
		if (mMonster.isAlive())
			mMonster.attack(mHero);

		//let the player bail out if desired
		System.out.println();
		System.out.print("Turn Over -->q to quit, anything else to continue: ");
		String quitCheck = keyboard.nextLine();
		userQuits = quitCheck.equalsIgnoreCase("q");
	}
	//end battle loop

			printBattleResults(mHero, mMonster);
	}//end battle method


	


private static void printBattleResults(Hero mHero, Monster mMonster) {
	if (!mMonster.isAlive())
		System.out.println(mHero.getName() + " IS VICTORIOUS!");
	else if (!mHero.isAlive())
		System.out.println(mHero.getName() + " was defeated  :-(");
	else//both are alive so user quit the game
		System.out.println("You cant quit now, fight the monster!!!");
}



private static int attackMenu(Hero mHero, Scanner keyboard) {

	String choice;

	do {
		System.out.println("1) Normal Attack");
		//System.out.println("2) " + mHero.specialAttackDescription());
		System.out.print("Choice --> ");

		choice = keyboard.nextLine();

		if(!(choice.equals("1") || choice.equals("2")))
		{
			System.out.println("You havent mastered any other moves!!");
		}

	}while(!(choice.equals("1") || choice.equals("2")));

	return Integer.parseInt(choice);
}

}


//
//Can you see this comment? if so were ready to go. 
//
///