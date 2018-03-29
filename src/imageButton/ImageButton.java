package imageButton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageButton extends JFrame {

	private JPanel contentPane;
	final JButton imgButton;
	final Icon clickImage;
	
	
	/**
	 * Create the frame.
	 */
	public ImageButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Icon image1 = new ImageIcon(getClass().getResource("Image1.png"));
		Icon image2 = new ImageIcon(getClass().getResource("Image2.png"));
		clickImage = new ImageIcon(getClass().getResource("Image3.gif"));
		
		imgButton = createImageButton(image1, image2);
		contentPane.add(imgButton, BorderLayout.CENTER);
		
		ButtonClickEventHandler buttonEventHandler = new ButtonClickEventHandler();
		imgButton.addActionListener(buttonEventHandler);		
	}

	private class ButtonClickEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			imgButton.setRolloverEnabled(false);
			imgButton.setIcon(clickImage);
		}
	}

	private JButton createImageButton(Icon image1, Icon image2) {
		JButton imgButton = new JButton(image1);
		/*imgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imgButton.setRolloverEnabled(false);
				imgButton.setIcon(clickImage);
			}
		});*/
		
		imgButton.setRolloverIcon(image2);
		return imgButton;
	}

}
