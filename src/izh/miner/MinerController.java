package izh.miner;

public class MinerController {

	Miner miner;

	public MinerController(Miner miner) {
		this.miner = miner;
	}

	public int getScore() {

		return miner.bank.score;
	}

	public void mine() {
		miner.mine();
	}

	public void activateXBonus(XBonus bonus) {
		miner.activeXBonus(bonus);
	}

	public void activatePlusBonus(PlusBonus plusBonus) {
		miner.activePlusBonus(plusBonus);
	}

	public boolean isXBonusAvailable() {

		return miner.bank.score > 10;
	}

	public boolean isPlusBonusAvailable() {

		return miner.bank.score % 15 == 0;
	}

}
