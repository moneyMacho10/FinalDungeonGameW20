package dungeon.room;

public class RoomTester {

	public static void main(String[] args) {
		Room room = new Room();
		
		room.setEastDoor();
		room.setNorthDoor();

		System.out.println(room.toString());
	}
	
	
}
