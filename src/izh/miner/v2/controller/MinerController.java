package izh.miner.v2.controller;

import izh.miner.v2.model.BonusFactory;
import izh.miner.v2.model.Miner;
import izh.miner.v2.model.PlusBonus;
import izh.miner.v2.model.XBonus;

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

		return miner.bank.score > BonusFactory.X_BONUS_COST;
	}

	public boolean isPlusBonusAvailable() {

		return miner.bank.score % BonusFactory.PLUS_BONUS_COST == 0;
	}

}
