package dungeon.maze;

import java.util.ArrayList;
import dungeon.room.*;

public class Maze {
	private Room[][] maze;
	private Room currentRoom;
	private Room entrance;
	private Room exit;
	private int rowPosition;
	private int columnPosition;
	private int numberOfColumns;
	
	public Maze(){
		maze = new Room[6][6];

		for(int i = 0; i < maze.length; i++) {
			for(int j = 0; j < maze[i].length; j++) {
				maze[i][j] = new Room();
			}
		}
		
//		this.maze[0][0].setSouthDoor();
//		this.maze[0][0].setEastDoor();
//		this.maze[0][1].setWestDoor();
//		this.maze[0][1].setEastDoor();
//		this.maze[0][2].setSouthDoor();
//		this.maze[0][2].setEastDoor();
		
		
		
	}
	
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	
	
	@Override
	public String toString() {
		return this.currentRoom.toString();
	}
	
}
