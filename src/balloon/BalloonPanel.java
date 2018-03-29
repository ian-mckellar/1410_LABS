package balloon;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class BalloonPanel extends JPanel {
	private Balloon balloon;
	private JLabel lblType;
	private JButton btnBalloon;

	/**
	 * Create the panel.
	 */
	public BalloonPanel(Balloon balloon) {
		this.balloon = balloon; // initialize field balloon

		setLayout(new BorderLayout(0, 0));
		setBackground(Color.WHITE);

		btnBalloon = new JButton();
		btnBalloon.setIcon(balloon.getSize().getIcon());
		btnBalloon.setBackground(Color.WHITE);
		add(btnBalloon, BorderLayout.CENTER);

		lblType = createLblType();
		add(lblType, BorderLayout.SOUTH);
	}

	private JLabel createLblType() {
		JLabel lblType = new JLabel();
		lblType.setOpaque(true);
		lblType.setBackground(Color.WHITE);
		lblType.setText(balloon.toString());
		lblType.setBorder(new EmptyBorder(12, 0, 12, 0));
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		return lblType;
	}

	public Balloon getBalloon() {
		return balloon;
	}

	/**
	 * Assigns new balloon to the field, displays the corresponding image of the balloon and the corresponding type.
	 * @param randomBalloon
	 */
	public void update(Balloon balloon) {
		// TODO Auto-generated method stub
		this.balloon = balloon;
		btnBalloon.setIcon(balloon.getSize().getIcon());
		lblType.setText(balloon.getType() + " " + balloon.getSize().toString());
	}

}
