package editor;
/**
 * 
 * annnnd one more that is part of the editor
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import GUI.GUIConstants;

public class EditorTile extends JLabel implements MouseListener
{
	public static boolean isPressed = false;
	Dimension index;
	public EditorTile(int y, int x,char rep)
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
		EditorTile.isPressed = true;
	}
	@Override
	public void mouseReleased(MouseEvent e)
	{
		EditorTile.isPressed = false;
	}
	@Override
	public void mouseEntered(MouseEvent e)
	{
		if(EditorTile.isPressed)
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
