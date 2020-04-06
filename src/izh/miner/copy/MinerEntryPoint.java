package izh.miner.copy;

import javax.swing.JFrame;

import izh.miner.copy.controller.MinerController;
import izh.miner.copy.model.Miner;
import izh.miner.copy.view.MinerWindowBuilder;

public class MinerEntryPoint {

	public static void main(String[] args) {
		//Model layer
		Miner miner = new Miner();
		//Controller layer
		MinerController controller = new MinerController(miner);
		//Interface layer
		JFrame frame = new MinerWindowBuilder().build(controller);
		frame.setVisible(true);
	}

}
