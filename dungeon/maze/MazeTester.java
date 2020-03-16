package dungeon.maze;

import java.util.Scanner;

public class MazeTester {
	public static void main(String[] args) {
		Maze maze = new Maze();
		
		System.out.println(maze.toString());
		Scanner read = new Scanner(System.in);
		
		int input = -1;
		
		while(input != 0) {
			System.out.println("1. North \n 2. East \n 3. South \n 4. West");
			input = read.nextInt();
			maze.getNextLocation(input);
			System.out.println(maze.toString());
		}

	}
	
	
}
