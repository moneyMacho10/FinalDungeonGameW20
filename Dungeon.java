
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
		    theHero = chooseHero(keyboard);
		    theMonster = generateMonster();
			battle(theHero, theMonster);

		} while (playAgain());

    }//end main method

/*-------------------------------------------------------------------
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
				System.out.println("BAD INPUT - TRY AGAIN");
		}

		return (choice.equalsIgnoreCase("y"));
	}//end playAgain method


/*-------------------------------------------------------------------
battle is the actual combat portion of the game.  It requires a Hero
and a Monster to be passed in.  Battle occurs in rounds.  The Hero
goes first, then the Monster.  At the conclusion of each round, the
user has the option of quitting.
---------------------------------------------------------------------*/
	public static void battle(Hero theHero, Monster theMonster)
	{
		Scanner keyboard = new Scanner(System.in);
		Boolean wantToQuit = false;
		System.out.println(theHero.getName() + " battles " +
				theMonster.getName());
		System.out.println("---------------------------------------------");


		//do battle
		while (theHero.isAlive() && theMonster.isAlive() && !wantToQuit)
		{
			int numTurns = theHero.determineNumberOfTurns(theMonster);

			//hero goes first
			while(numTurns > 0)
			{
				System.out.println("Number of Attacks Left: " + numTurns);

				int attackChoice = attackMenu(theHero, keyboard);

				if(attackChoice == 1)
					theHero.attack(theMonster);

				else //attackChoice == 2 Special Attack
					theHero.specialAttack(theMonster);
				numTurns--;
			}

			//monster's turn (provided it's still alive!)
			if (theMonster.isAlive())
				theMonster.attack(theHero);

			//let the player bail out if desired
			System.out.println();
			System.out.print("Turn Over -->q to quit, anything else to continue: ");
			String quitCheck = keyboard.nextLine();
			wantToQuit = quitCheck.equalsIgnoreCase("q");
		}//end battle loop

		printBattleResults(theHero, theMonster);
	}//end battle method

	private static void printBattleResults(Hero theHero, Monster theMonster) {
		if (!theMonster.isAlive())
			System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.isAlive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else//both are alive so user quit the game
			System.out.println("Quitters never win ;-)");
	}

	private static int attackMenu(Hero theHero, Scanner kb) {

		String choice;

		do {
			System.out.println("1) Normal Attack");
			System.out.println("2) " + theHero.specialAttackDescription());
			System.out.print("Choice --> ");

			choice = kb.nextLine();

			if(!(choice.equals("1") || choice.equals("2")))
			{
				System.out.println("BAD INPUT - TRY AGAIN");
			}

		}while(!(choice.equals("1") || choice.equals("2")));

		return Integer.parseInt(choice);
	}


}//end Dungeon class