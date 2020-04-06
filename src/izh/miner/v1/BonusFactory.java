package izh.miner.v1;

public class BonusFactory {

	static final int X_BONUS_COST  = 8;
	static final int PLUS_BONUS_COST = 15;

	XBonus createXBonus() {
		return new XBonus(X_BONUS_COST, 2);
	}

	PlusBonus createPlusBonus() {
		return new PlusBonus(PLUS_BONUS_COST, 20);
	}
}
