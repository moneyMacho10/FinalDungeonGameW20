package dungeon.characters;

import java.util.*;
import dungeon.characters.AttackType;

public class AttackTypeFactory {
	
	private Map<String, AttackType> attacks = new HashMap<String, AttackType>();
	
	public AttackType getAttackType(String attackName) {
		
		AttackType attack = attacks.get(attackName);
		
		if(attack == null) {
			attack = new AttackType(attackName);
			attacks.put(attackName, attack);
		}
		return attack;
	}
	
}//end AttackTypeFactory
