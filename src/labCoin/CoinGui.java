package labCoin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CoinGui extends JFrame {

	private JPanel contentPane;
	private JLabel lblCoin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGui frame = new CoinGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CoinGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = createPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		createLblCoin();
		contentPane.add(lblCoin, BorderLayout.CENTER);
		
		
	}

	private void createLblCoin() {
		lblCoin = new JLabel();
		lblCoin.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoin.setFont(new Font("Dialog", Font.BOLD, 24));
		lblCoin.setText("Click a coin!");
	}

	private JPanel createPanel() {
		JPanel panel = new JPanel();
		
		JButton btnPenny = new JButton("");
		btnPenny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCoin.setText(Coin.CENT.toString());
			}
		});
		btnPenny.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/images/UsCent.png")));
		panel.add(btnPenny);
		
		JButton btnNickel = new JButton("");
		btnNickel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCoin.setText(Coin.NICKEL.toString());
			}
		});
		btnNickel.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/images/UsNickel.png")));
		panel.add(btnNickel);
		
		JButton btnDime = new JButton("");
		btnDime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCoin.setText(Coin.DIME.toString());
			}
		});
		btnDime.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/images/UsDime.png")));
		panel.add(btnDime);
		
		JButton btnQuarter = new JButton("");
		btnQuarter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCoin.setText(Coin.QUARTER.toString());
			}
		});
		btnQuarter.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/images/UsQuarter.png")));
		panel.add(btnQuarter);
		
		return panel;
	}

}
