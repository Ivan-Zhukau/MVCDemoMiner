package izh.miner.v2.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import izh.miner.v2.controller.MinerController;
import izh.miner.v2.model.BonusFactory;
import izh.miner.v2.model.PlusBonus;
import izh.miner.v2.model.XBonus;

public class MinerWindowBuilder {

	private JButton xButton;
	private JButton plusButton;
	private MinerController minerController;
	private JLabel scorelabel;

	public JFrame build(MinerController minerController) {
		this.minerController = minerController;
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 500));
		JPanel comp = new JPanel();
		comp.setLayout(new GridLayout(4, 1));
		scorelabel = new JLabel();
		scorelabel.setText(Integer.toString(minerController.getScore()));
		comp.add(scorelabel);
		JButton mineButton = new JButton("mine");
		mineButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				minerController.mine();
				update();
			}

		});
		comp.add(mineButton);
		xButton = new JButton("X2");
		xButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				XBonus xBonus = new BonusFactory().createXBonus();
				minerController.activateXBonus(xBonus);
				update();
			}
		});
		comp.add(xButton);
		xButton.setEnabled(false);
		plusButton = new JButton("+20");
		plusButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PlusBonus plusBonus = new BonusFactory().createPlusBonus();
				minerController.activatePlusBonus(plusBonus);
				update();
			}
		});
		plusButton.setEnabled(false);
		comp.add(plusButton);
		frame.add(comp);
		return frame;
	}

	private void update() {
		scorelabel.setText(Integer.toString(minerController.getScore()));
		xButton.setEnabled(minerController.isXBonusAvailable());
		plusButton.setEnabled(minerController.isPlusBonusAvailable());
	}

}
