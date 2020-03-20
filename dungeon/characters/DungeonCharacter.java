package dungeon.characters;

public abstract class DungeonCharacter {
	
	protected String name;
	protected int hitPoints;
	protected int attackSpeed;
	protected double chanceToHit;
	protected int damageMin, damageMax;
	protected Attack mAttack;
	
	public DungeonCharacter(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax) {
		
		this.name = name;
		this.hitPoints = hitPoints;
		this.attackSpeed = attackSpeed;
		this.chanceToHit = chanceToHit;
		this.damageMin = damageMin;
		this.damageMax = damageMax;
	}

	public String getName() {
		
		return name;
	}

	public int getHitPoints() {
		
		return hitPoints;
	}
	
	public int getAttackSpeed() {
		
		return attackSpeed;
	}

	//Can be called by: heal method of monsters and Sorceress
	public void addHitPoints(int hitPoints) {
		
		if (hitPoints <=0)
			System.out.println("Hitpoint amount must be positive.\n");
		else {
			this.hitPoints += hitPoints;
			System.out.println(this.name + " has " + this.hitPoints + " remaining health.\n");
		}
	}
	
	//Can be called by: Theif
	public void addAttackSpeed(int addSpeed) {
		
		if(addSpeed <= 0)
			System.out.println("Attack Speed amount must be positive.\n");
		else {
			this.attackSpeed += addSpeed;
			System.out.println("Attack Speed was rasied by " + addSpeed + "\n");
		}		
	}

	//Can be called by: overridden versions in Hero and Monster
	public void subtractHitPoints(int hitPoints) {
		
		if (hitPoints <0)
			System.out.println("Hitpoint amount must be positive.");
		else if (hitPoints >0) {
			this.hitPoints -= hitPoints;
			if (this.hitPoints < 0)
				this.hitPoints = 0;
			System.out.println(getName() + " took <" + hitPoints + "> damage!");
			System.out.println(getName() + " now has " + getHitPoints() + " health remaining.");
			System.out.println();
		}//end else if

		if (this.hitPoints == 0)
			System.out.println(name + " has been killed!");
		
	}//end subtractHitPoints

    public boolean isAlive() {
    	
	  return (hitPoints > 0);
	}
    
    public abstract String attackDescription();
    
}//end class Character