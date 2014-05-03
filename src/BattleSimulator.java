import fighters.FighterDual;
import fighters.FighterDub;


public class BattleSimulator {
	FighterDub dub = new FighterDub();
	FighterDual dual = new FighterDual();
	private int hitDecrement;
	private int critRoll;
	
	private int addedTotal;
	private int addedTotal2;
	
	public BattleSimulator() {
		
	}
	public void battleRunner(){
	for(int r = 0; r < 10; r++){
	addedTotal = 0;
	addedTotal2 = 0;
	hitDecrement = 0;
	System.out.println("-------Double Hander Attacks!!--------------");
	for (int i = 0; i < 1; i++) {
		for (int atks = 0; atks < 2; atks++) {
			int hit = dub.getHitChance(hitDecrement);
			int damageOutput = dub.getDamage();
			if (hit >= 20) {
				critRoll = dub.getCritChance();
				if (critRoll <= 20 && critRoll >= 17) {
					
					int critCheck = dual.getHitChance(hitDecrement);
					if (critCheck >= 20) {
						for(int damageRolls = 0; damageRolls < 2; damageRolls++){
						int critDamage = dub.getDamage();
						System.out.println(">>" + critRoll + "<< >>" + critDamage
								+ "<<");
						System.out.println(critDamage);

						addedTotal = addedTotal + critDamage;
						}
						} else {
						System.out.println(damageOutput);
						addedTotal = addedTotal + damageOutput;
					}
				} else {

					System.out.println(damageOutput);
					addedTotal = addedTotal + damageOutput;

				}
			} else {
				System.out.println("0");
			}
			hitDecrement = hitDecrement - 5;
		}

	}
	System.out.println("FINAL " + addedTotal);
	System.out.println("--------------NEW CHALLENGER!!-----------------");
	System.out.println("---------ENTER THE DUAL WIELDER!!--------------");
	hitDecrement = 0;
	for (int i = 0; i < 1; i++) {//rounds of combat
		for (int atks = 0; atks < 3; atks++) {// number of attacks---------------------------------------------
			int hit = dual.getHitChance(hitDecrement);
			
			int damageOutput = dual.getDamage();
			if (hit >= 20) {//die roll-------------------------------------------------------------------------
				int critRoll = dual.getCritChance();
				if (critRoll <= 20 && critRoll >= 17) {//crit check off of crit chance rolled------------------
					int critCheck = dual.getHitChance(hitDecrement);
					if (critCheck >= 20) {//crit roll----------------------------------------------------------
						for(int damageRolls = 0; damageRolls < 3; damageRolls++){
						int doubleDamage = dub.getDamage();
						System.out.println(">>" + critRoll + "<<");
						System.out.println(doubleDamage);

						addedTotal2 = addedTotal2 + doubleDamage;
						}
						} else {
						System.out.println(damageOutput);//regular damage dealt -------------------------------
						addedTotal2 = addedTotal2 + damageOutput;
					}
				} else {

					System.out.println(damageOutput);
					addedTotal2 = addedTotal2 + damageOutput;

				}
			} else {
				System.out.println("0");
			}
			hitDecrement = hitDecrement - 5;
		}

	}
	System.out.println("FINAL " + addedTotal2);
}
	}
	}
