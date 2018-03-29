package balloon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class BalloonGui extends JFrame {

	private JPanel contentPane;
	private final Random rand = new Random();
	private JPanel mainPanel;
	private BalloonPanel leftBalloonPanel;
	private BalloonPanel rightBalloonPanel;
	private JLabel lblEqual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BalloonGui frame = new BalloonGui();
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
	public BalloonGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblTitle = createLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);

		JPanel controlPanel = createControlPanel();
		contentPane.add(controlPanel, BorderLayout.SOUTH);

		JPanel mainPanel = createMainPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
	}

	private JPanel createMainPanel() {
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(0, 5, 0, 5));

		mainPanel.setLayout(new GridLayout(0, 2, 10, 5));

		leftBalloonPanel = new BalloonPanel(getRandomBalloon());
		mainPanel.add(leftBalloonPanel);

		rightBalloonPanel = new BalloonPanel(getRandomBalloon());
		mainPanel.add(rightBalloonPanel);			
		
		updateLblEqual();
		
		return mainPanel;
	}

	private Balloon getRandomBalloon() {
		Size[] balloonSizes = Size.values();
		String randomBalloonTypes = rand.nextBoolean() ? "helium" : "air";
				
		int randomSizeIndex = rand.nextInt(balloonSizes.length);

		Size randomSize = balloonSizes[randomSizeIndex];

		return new Balloon(randomSize, randomBalloonTypes);
	}
	
	private JPanel createControlPanel() {
		JPanel controlPanel = new JPanel();
		controlPanel.setBorder(new EmptyBorder(10, 0, 10, 0));

		lblEqual = new JLabel("");
		lblEqual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEqual.setOpaque(true);
		controlPanel.add(lblEqual);
		
		JButton btnGetRandomBallon = new JButton("Get Random Ballons");
		btnGetRandomBallon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				leftBalloonPanel.update(getRandomBalloon());
				rightBalloonPanel.update(getRandomBalloon());	
				
				updateLblEqual();
			}
			
		});
		btnGetRandomBallon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		controlPanel.add(btnGetRandomBallon);

		return controlPanel;
	}
	
	private void updateLblEqual() {
		boolean equal = leftBalloonPanel.getBalloon().equals(rightBalloonPanel.getBalloon());
		
		if (equal) {
			lblEqual.setText("equal");
			lblEqual.setBackground(Color.ORANGE);
		} else {
			lblEqual.setText("not equal");
			lblEqual.setBackground(Color.WHITE);
		}
	}
	
	
	private JLabel createLblTitle() {
		JLabel lblTitle = new JLabel("Lab Balloon");
		lblTitle.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		return lblTitle;
	}

}
