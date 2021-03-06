package dungeon.characters;
import java.util.Scanner;

public class HeroFactory {

	public Hero generateHero() {
		
		Scanner keyboard = new Scanner(System.in);
		String selection; 
		heroPromptSelection();
		selection = keyboard.nextLine(); 
		
		switch(selection) {
		case "1":
			return new Warrior();
			
		case "2":
			return new Sorceress();
			
		case "3":
			return new Thief();
			
		case "4":
			return new Wonder_Duck();
		
		case "5":
			return new Tom_Capaul();
			
		default:
			return new Warrior();
		}
	}

	private void heroPromptSelection() {
		System.out.println("Select from the following heroes: " );
		System.out.println("1. Warrior\n" +
		        			"2. Sorceress\n" +
		        			"3. Thief\n" +
		        			"4. Wonder Duck\n" +
		        			"5. Tom Capaul\n" +
		        			"Choose a hero -->");
	}
	
}// end Hero Factory Class

