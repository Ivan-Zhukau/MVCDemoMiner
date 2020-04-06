package izh.miner.v2.model;

public class BonusFactory {
	
	public static final int X_BONUS_COST  = 8;
	public static final int PLUS_BONUS_COST = 15;

	public XBonus createXBonus() {
		return new XBonus(X_BONUS_COST, 2);
	}

	public PlusBonus createPlusBonus() {
		return new PlusBonus(PLUS_BONUS_COST, 20);
	}
}
