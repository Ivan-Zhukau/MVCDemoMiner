package izh.miner.v1;

public class BonusFactory {

	XBonus createXBonus() {
		return new XBonus(8, 2);
	}

	PlusBonus createPlusBonus() {
		return new PlusBonus(15, 20);
	}
}
