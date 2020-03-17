package dungeon.characters;


import java.util.Scanner;

/*-------------------------------------------------------------------
battle is the actual combat portion of the game.  It requires a Hero
and a Monster to be passed in.  Battle occurs in rounds.  The Hero
goes first, then the Monster.  At the conclusion of each round, the
user has the option of quitting.
---------------------------------------------------------------------*/
public class Battle {

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
				else if(attackOption == 2){
					mHero.specialAttack(mMonster);
				}
				
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
			System.out.println("2) " + mHero.specialAttackDescription());
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


	