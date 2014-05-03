import fighters.FighterDual;
import fighters.FighterDub;

public class Main {
	static FighterDub dub = new FighterDub();
	static FighterDual dual = new FighterDual();
	static int addedTotal;
	static int addedTotal2;
	static int hitDecrement;
	
	public Main() {

	}

	public static void main(String[] args) {
		BattleSimulator battle = new BattleSimulator();
		battle.battleRunner();
	}

}
