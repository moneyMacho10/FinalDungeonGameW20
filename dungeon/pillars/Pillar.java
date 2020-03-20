package dungeon.pillars;

import java.util.Random;

public class Pillar {
	private String encapsulation;
	private String abstraction;
	private String inheritance;
	private String polymorphism;
	private static int numberOfPillars;

	public Pillar() {
		this.encapsulation = null;
		this.abstraction = null;
		this.inheritance = null;
		this.polymorphism = null;
		numberOfPillars = 0;
	}
	
	public String getPillar() {
		Random randomNumber = new Random();
		int randomPillar = randomNumber.nextInt(4);
		
		if(randomPillar == 0 && this.encapsulation == null) {
			this.encapsulation = "Encapsulation";
			return this.encapsulation;
		
		}else if(randomPillar == 1 && this.abstraction == null) {
			this.abstraction = "Abstraction";
			return this.abstraction;
			
		}else if(randomPillar == 2 && this.inheritance == null) {
			this.inheritance = "Inheritance";
			return this.inheritance;
			
		}else if(randomPillar == 3 && this.polymorphism == null) {
			this.polymorphism = "Polymorphism";
			return this.polymorphism;
			
		}else {
			return getPillar();
		}
	}
	
	public boolean haveAllPillars() {
		return numberOfPillars == 4;
	}
	
	public void foundPillar() {
		numberOfPillars++;
	}
	
	@Override
	public String toString() {
		return "\nYou have found a Pillar of OO.\n";
	}
	
}