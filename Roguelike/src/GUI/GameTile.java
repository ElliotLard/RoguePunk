package GUI;

import java.awt.Color;
import javax.swing.JLabel;

public class GameTile
{
	protected JLabel gameTile;
	public GameTile(int y, int x,char rep)
	{
		gameTile = new JLabel();
		gameTile.setPreferredSize(GUIConstants.TILEDIMENSION);
		gameTile.setText(String.valueOf(rep));
		gameTile.setForeground(Color.white);
	}
	
	public void setChar(char c)
	{
		gameTile.setText(String.valueOf(c));
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
