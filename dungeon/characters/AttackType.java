package dungeon.characters;

import dungeon.characters.Attack;

public class AttackType implements Attack {
	private String attack;
	
	public AttackType(String newAttack) {
		attack = newAttack;
	}
	
	public String getAttackType() {
		return this.attack;
	}
	
	public void setAttackType(String newAttack) {
		if(newAttack == null)
			throw new IllegalArgumentException("New Attack is null");
		this.attack = newAttack;
	}
	
	public void attack(DungeonCharacter attacker, DungeonCharacter attacked) {
		boolean canAttack;
		int damage;
		
		canAttack = Math.random() <= attacker.chanceToHit;
		
		if (canAttack)
		{
			damage = (int)(Math.random() * (attacker.damageMax - attacker.damageMin + 1)) + attacker.damageMin;
			System.out.println(attacker.name + " " + attacker.attackDescription() + " at " + attacked.name);
			attacked.subtractHitPoints(damage);
		}//end if can attack
		else
		{
			System.out.println(attacker.getName() + "'s attack on " + attacked.getName() + " failed!\n");
		}//end else
	}//end attack method
	
	public void specAttack(Hero attacker, Monster attacked) {
		attacker.specialAttack(attacked);
	}
}//end AttackType Class
	