package dungeon.maze;

import java.util.Scanner;

import dungeon.pillars.Pillar;
import dungeon.room.Room;

public class Dungeon {
	private Room[][] maze;
	private Room currentRoom;
	private Room entrance;
	private Room exit;
	private int rowPosition;
	private int columnPosition;
	private Pillar pillar = new Pillar();

	public Dungeon() {
		this.maze = new Room[5][5];

		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {

				maze[i][j] = new Room();
			}
		}

		this.entrance = maze[0][0];
		this.exit = maze[4][4];
		this.entrance.setDiscoverable(null, ' ');
		this.exit.setDiscoverable(null, ' ');

		this.currentRoom = this.entrance;

		this.createDoors();
		this.createPillars();

	}

	private void createPillars() {
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
		this.maze[0][3].setEastDoor();
		this.maze[0][3].setSouthDoor();
		this.maze[0][4].setWestDoor();
		this.maze[0][4].setSouthDoor();

		// Row 1
		this.maze[1][0].setNorthDoor();
		this.maze[1][0].setSouthDoor();
		this.maze[1][1].setNorthDoor();
		this.maze[1][1].setEastDoor();
		this.maze[1][1].setSouthDoor();
		this.maze[1][2].setWestDoor();
		this.maze[1][2].setNorthDoor();
		this.maze[1][3].setNorthDoor();
		this.maze[1][4].setNorthDoor();
		this.maze[1][4].setSouthDoor();

		// Row 2
		this.maze[2][0].setNorthDoor();
		this.maze[2][0].setSouthDoor();
		this.maze[2][1].setNorthDoor();
		this.maze[2][1].setEastDoor();
		this.maze[2][2].setNorthDoor();
		this.maze[2][2].setEastDoor();
		this.maze[2][2].setWestDoor();
		this.maze[2][3].setWestDoor();
		this.maze[2][4].setNorthDoor();
		this.maze[2][4].setSouthDoor();

		// Row 3
		this.maze[3][0].setNorthDoor();
		this.maze[3][0].setEastDoor();
		this.maze[3][0].setSouthDoor();
		this.maze[3][1].setWestDoor();
		this.maze[3][2].setNorthDoor();
		this.maze[3][2].setEastDoor();
		this.maze[3][3].setWestDoor();
		this.maze[1][4].setNorthDoor();

		// Row 4
		this.maze[4][0].setNorthDoor();
		this.maze[4][0].setEastDoor();
		this.maze[4][1].setWestDoor();
		this.maze[4][1].setEastDoor();
		this.maze[4][2].setEastDoor();
		this.maze[4][2].setWestDoor();
		this.maze[4][3].setEastDoor();
		this.maze[4][3].setWestDoor();
		this.maze[4][4].setWestDoor();

	}

	public boolean isEndGame() {
		if(pillar.haveAllPillars() && this.currentRoom.equals(this.exit)) {
			System.out.println("\nYou have escaped with the Pillars of OO!\n");
			return true;
			
		}else if(this.currentRoom.equals(this.exit)) {
			System.out.println("\nYou need to collect the Pillars of OO to exit the maze.\n");
			return false;
			
		}else {
			return false;
		}
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

	public void toTravel() {
		Scanner input = new Scanner(System.in);
		int path = -1;
		while (path < 0 || path > 4) {
			System.out.println(this.toString());
			
			System.out.println("What path do you choose?");
			System.out.println("1. North Door");
			System.out.println("2. East Door");
			System.out.println("3. South Door");
			System.out.println("4. West Door");
			System.out.println("-------------------------");
			System.out.print("-->");
			path = input.nextInt();
		}

		if (path == 1 && this.currentRoom.isNorthDoor()) {
			this.rowPosition -= 1;
			this.currentRoom = this.maze[this.rowPosition][this.columnPosition];

		} else if (path == 2 && this.currentRoom.isEastDoor()) {
			this.columnPosition += 1;
			this.currentRoom = this.maze[this.rowPosition][this.columnPosition];

		} else if (path == 3 && this.currentRoom.isSouthDoor()) {
			this.rowPosition += 1;
			this.currentRoom = this.maze[this.rowPosition][this.columnPosition];

		} else if (path == 4 && this.currentRoom.isWestDoor()) {
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

<<<<<<< HEAD:dungeon/maze/Dungeon.java
}
=======
}
>>>>>>> 0c629d8dbb483056ec6b40212c9f36c00b705e6b:dungeon/maze/Maze.java
