package fighters;

public class FighterDub extends Stats{
		private int baseHitChance;
		
		Weapon greatSword = new Weapon(10);

		private int hitRoll;

		private int totalHitRoll;

		private int critRoll;
		public FighterDub() {
	
		baseHitChance = strMod + hitChance + weaponFocus + grtWeaponFocus - 5;
	}
	public int getHitChance(int hitDecrement){
		this.hitDecrement = hitDecrement;
		critRoll = (int)(Math.round(Math.random() * 20 + 1));
		totalHitRoll = baseHitChance + critRoll;
		return totalHitRoll;
	}

	public int getDamage(){
		int damageRoll = (int) (Math.round(Math.random() * greatSword.damageRoll + 1 + 2));
		int damage = greatSword.damageRoll + strMod + weaponSpecialization + 5 + 2; 
		int totalDamage = damageRoll + damage;
		return totalDamage;
	}
	public int getCritChance(){
		critRoll = (int)(Math.round(Math.random() * 20 + 1));
		return critRoll;
	}
}
