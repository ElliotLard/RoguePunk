package GUI;

import javax.swing.JLabel;
import environment.Cell;
public class Tile extends JLabel
{
	Cell cell;
	public Tile(Cell c)
	{
		cell = c;
		this.setText(c.displayString());
		this.setPreferredSize(GUIConstants.TILESIZE);
	}

}
