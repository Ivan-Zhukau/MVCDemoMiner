package izh.miner.v2;

import javax.swing.JFrame;

import izh.miner.v2.controller.MinerController;
import izh.miner.v2.model.Miner;
import izh.miner.v2.view.MinerWindowBuilder;

public class MinerEntryPoint {

	public static void main(String[] args) {
		// Model layer
		Miner miner = new Miner();
		// Controller layer
		MinerController controller = new MinerController(miner);
		// Interface layer
		JFrame frame = new MinerWindowBuilder().build(controller);
		frame.setVisible(true);
	}

}
