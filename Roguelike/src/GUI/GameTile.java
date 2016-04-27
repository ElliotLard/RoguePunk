package GUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class GameTile
{
	private JLabel gameTile;
	public GameTile(int y, int x,char rep)
	{
		gameTile = new JLabel();
		gameTile.setPreferredSize(GUIConstants.TILEDIMENSION);
		gameTile.setText(String.valueOf(rep));
		gameTile.setForeground(Color.white);
	}
	public char getRep()
	{
		return gameTile.getText().charAt(0);
	}
	public JLabel get()
	{
		return gameTile;
	}
}
