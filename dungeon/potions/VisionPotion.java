package dungeon.potions;
import dungeon.maze.*;
import dungeon.room.Room;
import dungeon.characters.DungeonCharacter;

public class VisionPotion{
	private Room currentRoom;
	private Maze maze;
	
	public VisionPotion() {
	}
	
	public void usePotion(Room[][] maze, int row, int column) {
		this.currentRoom = maze[row][column];
		this.currentRoom.setDiscoverable('X');
		
		for(int r = 0; r < maze.length; r++) {
			System.out.println(maze[r][column]);
		}
		
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "You have been granted vision of part of the maze. \nX is your current location.";
	}

}
