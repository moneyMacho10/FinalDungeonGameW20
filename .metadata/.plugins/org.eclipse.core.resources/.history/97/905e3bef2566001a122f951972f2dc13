package dungeon.room;

public class Room {
	private char[][] singleRoom;
	private char northDoor;
	private char southDoor;
	private char eastDoor;
	private char westDoor;
	
	public Room() {
		this.singleRoom = new char[3][3];
		
		this.createWalls();
		
		this.northDoor = singleRoom[0][1];
		this.southDoor = singleRoom[2][1];
		this.eastDoor = singleRoom[1][2];
		this.westDoor = singleRoom[1][0];
		
		
	}
	
	private void createWalls() {
		for(int i = 0; i < singleRoom.length; i++){
			for(int j = 0; j < singleRoom[0].length; j++) {
				singleRoom[i][j] = '*';
			}
		}
	}
	
	//TODO set the object for a room (monster, pit, potions or pillars or nothing)
	public void setRoomObject() {
		
	}
	
	public void setNorthDoor() {
		this.northDoor = '-';
		this.singleRoom[0][1] = this.northDoor;
	}
	
	public void setSouthDoor() {
		this.southDoor = '-';
		this.singleRoom[2][1] = this.southDoor;
	}
	
	public void setEastDoor() {
		this.eastDoor = '|';
		this.singleRoom[1][2] = this.eastDoor;
	}
	
	public void setWestDoor() {
		this.westDoor = '|';
		this.singleRoom[1][0] = this.westDoor;
	}
	
	public boolean isNorthDoor() {
		if(this.northDoor != '*')
			return true;
		else
			return false;
	}
	
	public boolean isSouthDoor() {
		if(this.southDoor != '*')
			return true;
		else
			return false;
	}
	
	public boolean isEastDoor() {
		if(this.eastDoor != '*')
			return true;
		else
			return false;
	}
	
	public boolean isWestDoor() {
		if(this.westDoor != '*')
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for(int i = 0; i < singleRoom.length; i++){
			for(int j = 0; j < singleRoom[0].length; j++) {
				result += singleRoom[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}
	
	
}
