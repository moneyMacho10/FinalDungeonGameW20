package dungeon.maze;

import java.util.ArrayList;
import dungeon.pillars.Pillar;
import dungeon.room.Room;

public class Maze {
	private Room[][] maze;
	private Room currentRoom;
	private Room entrance;
	private Room exit;
	private int rowPosition;
	private int columnPosition;
	private int numberOfPillars;
	private Pillar pillar;
	
	public Maze() {
		maze = new Room[4][4];

		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				
				maze[i][j] = new Room();
			}
		}

		this.entrance = maze[0][0];
		this.exit = maze[3][3];
		
		this.entrance.setDiscoverable(null, ' ');
		this.exit.setDiscoverable(null, ' ');

		this.currentRoom = this.entrance;

		this.createDoors();
		
		this.maze[1][0].setDiscoverable(pillar, 'O');
		this.maze[1][3].setDiscoverable(pillar, 'O');
		this.maze[2][3].setDiscoverable(pillar, 'O');
		this.maze[3][1].setDiscoverable(pillar, 'O');

	}
	
	private void createDoors() {
		// Row 0
		this.maze[0][0].setSouthDoor();
		this.maze[0][0].setEastDoor();
		this.maze[0][1].setWestDoor();
		this.maze[0][1].setSouthDoor();
		this.maze[0][2].setSouthDoor();
		this.maze[0][2].setEastDoor();
		this.maze[0][3].setWestDoor();
		this.maze[0][3].setSouthDoor();

		// Row 1
		this.maze[1][0].setNorthDoor();
		this.maze[1][0].setSouthDoor();
		this.maze[1][1].setNorthDoor();
		this.maze[1][1].setEastDoor();
		this.maze[1][1].setSouthDoor();
		this.maze[1][2].setWestDoor();
		this.maze[1][2].setNorthDoor();
		this.maze[1][3].setNorthDoor();

		// Row 2
		this.maze[2][0].setNorthDoor();
		this.maze[2][0].setSouthDoor();
		this.maze[2][1].setNorthDoor();
		this.maze[2][1].setEastDoor();
		this.maze[2][2].setNorthDoor();
		this.maze[2][2].setEastDoor();
		this.maze[2][2].setWestDoor();
		this.maze[2][3].setWestDoor();

		// Row 3
		this.maze[3][0].setNorthDoor();
		this.maze[3][0].setEastDoor();
		this.maze[3][1].setWestDoor();
		this.maze[3][2].setNorthDoor();
		this.maze[3][2].setEastDoor();
		this.maze[3][3].setWestDoor();
	}

	public Room[][] getMaze() {
		return this.maze;
	}

	public Room getCurrentRoom() {
		return this.currentRoom;
	}

	public void setCurrentRoom(int row, int column) {
		this.rowPosition = row;
		this.columnPosition = column;
		this.currentRoom = this.maze[this.rowPosition][this.columnPosition];
	}

	public int getRowPosition() {
		return this.rowPosition;
	}

	public int getColumnPosition() {
		return this.columnPosition;
	}

	public void getNextLocation(int direction) {
		/*
		 * 1. Up 2. Right 3. Down 4. Left
		 */

		if (direction == 1 && this.currentRoom.isNorthDoor()) {
			this.rowPosition -= 1;
			this.currentRoom = this.maze[this.rowPosition][this.columnPosition];

		} else if (direction == 2 && this.currentRoom.isEastDoor()) {
			this.columnPosition += 1;
			this.currentRoom = this.maze[this.rowPosition][this.columnPosition];
			

		} else if (direction == 3 && this.currentRoom.isSouthDoor()) {
			this.rowPosition += 1;
			this.currentRoom = this.maze[this.rowPosition][this.columnPosition];

		} else if (direction == 4 && this.currentRoom.isWestDoor()) {
			this.columnPosition -= 1;
			this.currentRoom = this.maze[this.rowPosition][this.columnPosition];

		} else {
			System.out.println("\nGood Sir, that is a wall. \n");
		}
		
	}

	@Override
	public String toString() {
		return this.currentRoom.toString();
	}

}
