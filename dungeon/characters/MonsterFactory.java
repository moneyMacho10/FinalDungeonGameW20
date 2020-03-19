package dungeon.characters;
import java.util.Random;

public class MonsterFactory {
	
	public Monster generateMonster()
	{
		Random random = new Random();
		int choice = random.nextInt(4);

		switch(choice)
		{
			case 1: return new Ogre();

			case 2: return new Gremlin();

			case 3: return new Skeleton(); 
				
			case 4: return new Zombie();
				
			case 5: return new Stu_Steiner();
				
			default: return new Ogre();// 0
		}//end switch
	}//end generateMonster method
	
} //end Monster Factory Class
