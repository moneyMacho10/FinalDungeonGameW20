package dungeon.maze;

import java.util.Scanner;
import dungeon.potions.*;

public class DungeonTester {
	public static void main(String[] args) {
		Dungeon maze = new Dungeon();
		
		System.out.println(maze.toString());
		maze.toTravel();

	}
	
}
