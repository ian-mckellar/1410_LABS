package balloon;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public enum Size {
	XS(new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon20.jpg"))), 
	S(new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon40.jpg"))), 
	M(new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon60.jpg"))), 
	L(new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon80.jpg"))), 
	XL(new ImageIcon(BalloonPanel.class.getResource("/balloon/images/balloon100.jpg")));

	private Icon icon;

	public Icon getIcon() {
		return icon;
	}

	private Size(Icon icon) {
		this.icon = icon;
	}

}
