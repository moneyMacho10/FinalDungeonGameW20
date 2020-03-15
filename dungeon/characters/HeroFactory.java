package dungeon.characters;
import java.util.Scanner;

public class HeroFactory {

	public Hero generateHero(String heroType) {
		
		if(heroType.equalsIgnoreCase("hero")) {
			return heroSelection(new Scanner(System.in));
		}
		else {
			
			throw new IllegalArgumentException("You're a fool. Not a hero.");
			
		}	
	}
	
	public Hero heroSelection(Scanner keyboard) {
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
			
		default:
			return new Warrior();
			
		}
	}

	private void heroPromptSelection() {
		System.out.println("Select from the following heroes: " );
		System.out.println(
				"1. Warrior\n" +
		        "2. Sorceress\n" +
		        "3. Thief\n" +
		            
		        "Choose a hero -->"				
				);
	
	
	
	}
	
	
	
}
