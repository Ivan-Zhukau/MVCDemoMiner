package izh.miner.copy.model;

public class Miner {

	public Bank bank;

	int increment = 1;

	public Miner() {
		this.bank = new Bank();
	}

	public void mine() {
		bank.score = bank.score + increment;
	}

	public void activeXBonus(XBonus bonus) {
		bank.score = bank.score - bonus.cost;
		increment = increment * bonus.multiplier;
	}

	public void activePlusBonus(PlusBonus bonus) {
		bank.score = bank.score - bonus.cost;
		bank.score = bank.score + bonus.plusAmount;
	}
}
