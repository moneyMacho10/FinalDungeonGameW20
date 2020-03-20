package dungeon.potions;
import dungeon.maze.*;
import dungeon.room.Room;
import dungeon.characters.DungeonCharacter;

public class VisionPotion{
	private Room currentRoom;
	private Dungeon maze;
	
	public VisionPotion() {
	}
	
	public void usePotion(Room[][] maze, int row, int column) {
		this.currentRoom = maze[row][column];
		this.currentRoom.setDiscoverSymbol('U');
		
		System.out.println("-------------");
		for(int r = 0; r < maze.length; r++) {
			System.out.println(maze[r][column]);
		}
		System.out.println("-------------");
	}
	
	@Override
	public String toString() {
		return "You have been granted vision of part of the maze. \nU is your current location.";
	}

}