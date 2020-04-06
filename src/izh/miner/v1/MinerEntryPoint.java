package izh.miner.v1;

import javax.swing.JFrame;

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
