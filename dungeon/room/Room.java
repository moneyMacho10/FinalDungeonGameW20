package dungeon.room;

import java.util.Random;
import dungeon.characters.MonsterFactory;
import dungeon.deterents.Pit;
import dungeon.pillars.Pillar;
import dungeon.potions.HealingPotion;
import dungeon.potions.VisionPotion;

public class Room {
	private char[][] singleRoom;
	private char northDoor;
	private char southDoor;
	private char eastDoor;
	private char westDoor;
	private Object discoverable;
	private char discoverCharacter;
	
	public Room() {
		this.singleRoom = new char[3][3];
		
		this.createWalls();
		
		this.northDoor = singleRoom[0][1];
		this.southDoor = singleRoom[2][1];
		this.eastDoor = singleRoom[1][2];
		this.westDoor = singleRoom[1][0];
		
		setRoomObject();
		
		this.singleRoom[1][1] = this.discoverCharacter;
		
		
	}
	
	private void createWalls() {
		for(int i = 0; i < singleRoom.length; i++){
			for(int j = 0; j < singleRoom[0].length; j++) {
				singleRoom[i][j] = '*';
			}
		}
	}
	
	public void setRoomObject() {
		Random randomNumber = new Random();
		
		int objectChance = randomNumber.nextInt(5);
		
		if(objectChance == 0) {
			this.discoverable = new Pillar();
			this.discoverCharacter = 'O';
			
			
		}else if(objectChance == 1) {
			this.discoverable = new Pit();
			this.discoverCharacter = 'P';
			
		}else if(objectChance == 2) {
			this.discoverable = new MonsterFactory();
			this.discoverCharacter = 'M';
			
		}else if(objectChance == 3) {
			this.discoverable = new HealingPotion();
			this.discoverCharacter = 'H';
			
		}else if(objectChance == 4) {
			this.discoverable = new VisionPotion();
			this.discoverCharacter = 'V';
			
		}else {
			System.out.println("Error: Random number generator for setRoomObject is wrong.");
		}
		
	}
	
	public Object getDiscoverable() {
		return this.discoverable;
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
