package GUI;

import java.awt.Color;
import javax.swing.JLabel;
/**
 * this is the jlabel that will be used to fill in the gamestate
 * @author elliotlard
 *
 */
public class GameTile implements Displayable
{
	protected JLabel gameTile;
	/**
	 * initializes a tile with a location and representation
	 * @param y
	 * @param x
	 * @param rep
	 */
	public GameTile(int y, int x,char rep)
	{
		gameTile = new JLabel();
		gameTile.setPreferredSize(GUIConstants.TILEDIMENSION);
		gameTile.setText(String.valueOf(rep));
		gameTile.setForeground(Color.white);
	}
	
	/**
	 * sets the representation of the label
	 * used for updating the gui
	 * @param c
	 */
	public void setChar(char c)
	{
		gameTile.setText(String.valueOf(c));
	}
	/**
	 * returns the representation of the tile
	 */
	public char getRep()
	{
		return gameTile.getText().charAt(0);
	}
	/**
	 * returns the jlabel itself
	 * @return
	 */
	public JLabel get()
	{
		return gameTile;
	}
}
