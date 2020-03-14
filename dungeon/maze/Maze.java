package dungeon.maze;

import java.util.ArrayList;
import dungeon.room.*;

public class Maze {
	private Room[][] maze;
	private int rowPosition;
	private int columnPosition;
	
	public Maze(){
		maze = new Room[6][6];

		for(int i = 0; i < maze.length; i++) {
			for(int j = 0; j < maze[i].length; j++) {
				maze[i][j] = new Room();
			}
		}
		
		
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for(int i = 0; i < maze.length; i++) {
			for(int j = 0; j < maze[i].length; j++) {
				result += maze[i][j];
			}
			result += "\n";
		}
		return result;
	}
	
}
