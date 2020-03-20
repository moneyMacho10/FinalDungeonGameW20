package dungeon;

import java.util.Random;
import java.util.Scanner;
import dungeon.characters.*;
import dungeon.maze.Dungeon;
import dungeon.room.*;
import dungeon.pillars.*;
import dungeon.potions.*;
import dungeon.deterents.*;

public class DungeonAdventure
{
	public static Hero mHero;; 
	static Dungeon mMaze = new Dungeon();
	static Monster mMonster;
	static Pillar pillar;
	static HealingPotion hp;
	static VisionPotion vp;
	static Pit pit;

    Battle mBattle;

	public static void main(String[] args){
		
		do {
			//Displaying Game Rules
			displayGameRules();
			
			//Character Development
			HeroFactory myHeroFactory = new HeroFactory();
			mHero = myHeroFactory.generateHero();
			
			//Traverse Through Maze
			while(mHero.isAlive() && !mMaze.isEndGame()) {
				
				mMaze.toTravel();
				Room room = mMaze.getCurrentRoom();
				
				if(room.getDiscoverSymbol() == 'X') {
					System.out.println("You have encountered a Monster!!!");
					Battle.battle(mHero, (Monster)room.getDiscoverable());
					
				}else if(room.getDiscoverSymbol() == 'O') {
					pillar = (Pillar)room.getDiscoverable();
					pillar.foundPillar();
					System.out.println(pillar.toString());
					
				}else if(room.getDiscoverSymbol() == 'H') {
					hp = (HealingPotion)room.getDiscoverable();
					hp.usePotion(mHero);
					System.out.println(hp.toString());
					
					
				}else if(room.getDiscoverSymbol() == 'V') {
					vp = (VisionPotion)room.getDiscoverable();
					vp.usePotion(mMaze.getMaze(), mMaze.getRowPosition(), mMaze.getColumnPosition());
					System.out.println(vp.toString());
					
					
				}else if(room.getDiscoverSymbol() == 'P') {
					pit = (Pit)room.getDiscoverable();
					pit.fallInPit(mHero);
					System.out.println(pit.toString());
					
				}
				
				if(pillar != null && pillar.haveAllPillars()) {
					System.out.println("You have collected all the Pillars of OO!");
					System.out.println("Find the exit and get out!");
				}
				
				if(mMaze.isEndGame()) {
					break;
				}
			}
			
		}while(playAgain());
		
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