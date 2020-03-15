package dungeon.pillars;
import java.util.Random;

public class Pillar {
	private int numberOfColumns;
	private String encapsulation;
	private String abstraction;
	private String inheritance;
	private String polymorphism;
	
	public Pillar() {
		this.encapsulation = null;
		this.abstraction = null;
		this.inheritance = null;
		this.polymorphism = null;
		this.numberOfColumns = 0;
	}
	
	public String getPillar() {
		Random randomNumber = new Random();
		int randomPillar = randomNumber.nextInt(4);
		
		if(randomPillar == 0 && this.encapsulation == null) {
			this.encapsulation = "Encapsulation";
			this.numberOfColumns++;
			return this.encapsulation;
		
		}else if(randomPillar == 1 && this.abstraction == null) {
			this.abstraction = "Abstraction";
			this.numberOfColumns++;
			return this.abstraction;
			
		}else if(randomPillar == 2 && this.inheritance == null) {
			this.inheritance = "Inheritance";
			this.numberOfColumns++;
			return this.inheritance;
			
		}else if(randomPillar == 3 && this.polymorphism == null) {
			this.polymorphism = "Polymorphism";
			this.numberOfColumns++;
			return this.polymorphism;
			
		}else {
			return "Error: Random number generator for pillars is incorrect"
		}
	}
	
	public boolean haveAllColumns() {
		if(this.numberOfColumns == 4)
			return true;
		
		else
			return false;
	}
	
	
	public String getFoundColumns() {
		String result = "";
		
		if(this.encapsulation != null)
			result += this.encapsulation + " ";
		
		if(this.abstraction != null)
			result += this.abstraction + " ";
		
		if(this.inheritance != null)
			result += this.inheritance + " ";
		
		if(this.polymorphism != null)
			result += this.polymorphism;
		
		return result;
	}
	
	
}
