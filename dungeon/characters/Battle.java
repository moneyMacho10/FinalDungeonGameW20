package dungeon.characters;

import java.util.Scanner;
import dungeon.characters.Attack;

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
		AttackTypeFactory factory = new AttackTypeFactory();
		AttackType attacks = new AttackType("");
		
		System.out.println("_____________________________________________________________________________________________\n");
		
		while(mHero.isAlive() && mMonster.isAlive() && !userQuits) {

			int numOfTurns = mHero.determineNumberOfTurns(mMonster);
			
			while(numOfTurns > 0 && mMonster.isAlive()) {	
		
				System.out.println("Attacks Left: " + numOfTurns + "");
				
				int attackOption = attackMenu(mHero, keyboard);
				
				if(attackOption == 1){
					attacks.setAttackType(mHero.attackDescription());
					attacks.attack(mHero, mMonster);
				} 
				else if(attackOption == 2){
					attacks.setAttackType(mHero.specialAttackDescription());
					attacks.specAttack(mHero, mMonster); 
				}
				
				numOfTurns--;
				
			}
			
			//monster's turn (provided it's still alive!)
			if (mMonster.isAlive()) {
				attacks.setAttackType(mMonster.attackDescription());
				attacks.attack(mMonster, mHero);
			}
			
			//let player bail out if desired
			System.out.println();
			System.out.print("Press q to quit, or anything else to continue: ");
			String quitCheck = keyboard.nextLine();
			System.out.println();
			userQuits = quitCheck.equalsIgnoreCase("q");
			
		}//end battle loop
		
		printBattleResults(mHero, mMonster);
		
	}//end battle method
	

	private static void printBattleResults(Hero mHero, Monster mMonster) {
		
		if (!mMonster.isAlive())
			System.out.println("\n" + mHero.getName() + " IS VICTORIOUS!\n");
		else if (!mHero.isAlive())
			System.out.println("\n" + mHero.getName() + " was defeated! \n");
		else//both are alive so user quit the game
			System.out.println("You cant quit now, fight the monster!!!\n");
	}

	private static int attackMenu(Hero mHero, Scanner keyboard) {

		String choice;

		do {
			System.out.println("1) Normal Attack");
			System.out.println("2) " + mHero.specialAttackDescription());
			System.out.print("Choice --> ");

			choice = keyboard.nextLine();
			
			System.out.println();
			
			if(!(choice.equals("1") || choice.equals("2")))
			{
				System.out.println("You havent mastered any other moves!!\n");
			}

		}while(!(choice.equals("1") || choice.equals("2")));

		return Integer.parseInt(choice);
	}//end attackMenu

}//end Battle Class


	