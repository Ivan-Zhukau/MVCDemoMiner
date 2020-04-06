package izh.miner.copy.model;

public class BonusFactory {

	public XBonus createXBonus() {
		return new XBonus(8, 2);
	}

	public PlusBonus createPlusBonus() {
		return new PlusBonus(15, 20, 10);
	}
}
