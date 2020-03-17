package dungeon.characters;
public interface Attack {
	public void attack(DungeonCharacter monster, DungeonCharacter myHero);
}

/*
public void attack(DungeonCharacter opponent)
{
	boolean canAttack;
	int damage;
	canAttack = Math.random() <= chanceToHit;
	if (canAttack)
	{
		damage = (int)(Math.random() * (damageMax - damageMin + 1))
					+ damageMin ;
		opponent.subtractHitPoints(damage);
		System.out.println();
	}//end if can attack
	else
	{
		System.out.println(getName() + "'s attack on " + opponent.getName() +
							" failed!");
		System.out.println();
	}//end else
}//end attack method
*/