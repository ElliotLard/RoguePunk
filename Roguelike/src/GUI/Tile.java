package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import dungeon.DungeonAdapter;
import dungeon.DungeonEditor;

public class Tile extends JLabel implements MouseListener
{
	public static boolean isPressed = false;
	Dimension index;
	public Tile(int y, int x,char rep)
	{
		this.setPreferredSize(GUIConstants.TILEDIMENSION);
		this.setText(String.valueOf(rep));
		this.setForeground(Color.white);
		addMouseListener(this);
		index = new Dimension(y, x);
	}

	public char getRep()
	{
		return this.getText().charAt(0);
	}
	@Override
	public void mousePressed(MouseEvent e)
	{
		Tile.isPressed = true;
	}
	@Override
	public void mouseReleased(MouseEvent e)
	{
		Tile.isPressed = false;
	}
	@Override
	public void mouseEntered(MouseEvent e)
	{
		if(Tile.isPressed)
		{
			String rep = DungeonEditor.getRep();
			this.setText(rep);
		}
	}

	@Override
	public void mouseExited(MouseEvent e){}
	@Override
	public void mouseClicked(MouseEvent e){}
}
