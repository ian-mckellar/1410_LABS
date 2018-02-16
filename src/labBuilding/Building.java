package labBuilding;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel {
	private Color[] colors = { Color.RED, Color.ORANGE, Color.YELLOW, Color.PINK, Color.GREEN };
	private final Random rand = new Random();

	private Color getRandomColor() {
		int randomIndex = rand.nextInt(colors.length);
		return colors[randomIndex];
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 250, 350);

		g.setColor(Color.ORANGE);
		g.fillRect(200, 350, 50, 100);

		g.setColor(Color.MAGENTA);
		g.fillOval(220, 380, 15, 15);

		for (int i = 0; i <= 3; i++) {
			g.setColor(getRandomColor());
			g.fillRect(125 + 50 * i, 125, 25, 25);
			for (int j = 0; j <= 2; j++) {
				g.setColor(getRandomColor());
				g.fillRect(125 + 50 * i, 175 + 50 * j, 25, 25);
			}
		}
	}
}
