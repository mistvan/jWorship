/*
 * Created on 16.9.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package sk.asc.worship;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JToggleButton;

public class FormatButton extends JToggleButton {
	

	private static final Dimension DIMENSION = new Dimension(22, 22);

	public FormatButton() {
		super();
		Dimension d = DIMENSION;
		setMinimumSize(d);
		setPreferredSize(d);
	}

	public Color getBackground() {
		Color c = super.getBackground();
		if (c != null && isSelected())
			return /* c.darker().darker().darker() */Color.green;
		return c;
	}

}
