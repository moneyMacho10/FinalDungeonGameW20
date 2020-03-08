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
    public static void main(String[] args)
	{


    	Hero theHero;
		Monster theMonster;

		Scanner keyboard = new Scanner(System.in);

		do
		{
		    
			gameRules();
			
			
		    
			

			System.out.println("1) PLAY GAME");
			System.out.println("Game Choice: ");
			
			String startGame = keyboard.nextLine();
			
			if(startGame.equalsIgnoreCase("1")) {
			                                                 
				theHero = chooseHero(keyboard);
				theMonster = generateMonster();
				Battle.battle(theHero, theMonster);
	//		                battle(theHero, theMonster);  
			}                                                 
			
			
		} while (playAgain());

    }//end main method

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
		choice = keyboard.nextLine();

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
 * Monster: generateMonster() method will become factory pattern for monsters  inside the dungeon character class
 * 
generateMonster randomly selects a Monster and returns it.  It utilizes
a polymorphic reference (Monster) to accomplish this task.
---------------------------------------------------------------------*/
	public static Monster generateMonster()
	{
		Random random = new Random();
		int choice = random.nextInt(3);

		switch(choice)
		{
			case 1: return new Ogre();

			case 2: return new Gremlin();

			default: return new Skeleton(); // 0
		}//end switch
	}//end generateMonster method

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



}//end Dungeon class




//
//Can you see this comment? if so were ready to go. 
//
///