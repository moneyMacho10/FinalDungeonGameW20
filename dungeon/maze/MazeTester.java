package dungeon.maze;

public class MazeTester {
	public static void main(String[] args) {
		Maze maze = new Maze();
		
		System.out.println(maze.toString());
		
		maze.getNextLocation(2);
		
		System.out.println(maze.toString());
		
		maze.getNextLocation(3);
		
		System.out.println(maze.toString());
	}
	
	
}
