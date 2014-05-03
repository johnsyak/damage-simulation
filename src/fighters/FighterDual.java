package fighters;

public class FighterDual extends Stats {
	private int twoWeaponFighting = 2;

	int totalDamage;
	int damage;

	public int baseHitChance = 0;
	public int hitRoll1 = 0;
	public int critRoll = 0;
	Weapon orcishAxe = new Weapon(7);

	private int totalHitRoll;

	public FighterDual() {
		baseHitChance = strMod + hitChance + weaponFocus + grtWeaponFocus
				- twoWeaponFighting;
	}

	public int getDamage() {

		baseDamage = strMod + weaponSpecialization;

		damageRoll = (int) (Math.round(Math.random() * orcishAxe.damageRoll + 1 + 4));
		totalDamage = damageRoll + baseDamage;
		return totalDamage;
	}

	public int getHitChance(int hitDecrement) {
		this.hitDecrement = hitDecrement;
		critRoll = (int) (Math.round(Math.random() * 20 + 1));
		totalHitRoll = critRoll + baseHitChance;
		return totalHitRoll;
	}

	public int getCritChance() {
		critRoll = (int) (Math.round(Math.random() * 20 + 1));
		return critRoll;
	}
}
